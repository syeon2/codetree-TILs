import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;
        if (a < c && b < c) {
            ans += (b - a) + (d - c);
        } else if (c < a && d < a) {
            ans += (b - a) + (d - c);
        } else {
            int start = Math.min(a, c);
            int end = Math.max(b, d);

            ans += end - start;
        }

        System.out.print(ans);
    }
}