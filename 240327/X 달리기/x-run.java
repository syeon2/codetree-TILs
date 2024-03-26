import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int ans = 0;

        int v = 1;
        while (X > 0) {
            X -= v;
            ans++;

            if (move(v + 1) <= X) v++;
            else if (move(v) <= X) continue;
            else v--;
        }

        System.out.print(ans);
    }

    public static int move(int n) {
        if (n == 1) return 1;
        return n + move(n - 1);
    }
}