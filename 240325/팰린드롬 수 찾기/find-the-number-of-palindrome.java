import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;

        for (int i = X; i <= Y; i++) {
            if (isFal(i)) ans++;
        }

        System.out.print(ans);
    }

    public static boolean isFal(int n) {
        if (n < 10) return true;

        char[] list = String.valueOf(n).toCharArray();

        for (int i = 0; i <= list.length / 2; i++) {
            if (list[i] != list[list.length - i - 1]) return false;
        }

        return true;
    }
}