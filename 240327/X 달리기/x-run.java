import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int ans = 0;

        int v = 0;
        while (X > 0) {
            X -= v;

            int tempV = v + 1;
            if (move(tempV) <= X) {
                v++;
                ans++;
            } else if (move(v) <= X) {
                ans++;
            } else {
                v--;
                ans++;
            }
        }

        System.out.print(ans - 1);
    }

    public static int move(int n) {
        if (n == 1) return 1;
        return n + move(n - 1);
    }
}