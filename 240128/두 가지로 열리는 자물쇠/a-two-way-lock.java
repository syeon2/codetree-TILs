import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int cnt = 0;

        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {

                for (int j = 1; j <= N; j++) {

                    if ((Math.abs(a1 - i) <= 2 || N - Math.abs(a1 - i) <= 2) && (Math.abs(b1 - k) <= 2 || N - Math.abs(b1 - k) <= 2) && (Math.abs(c1 - j) <= 2 || N - Math.abs(c1 - j) <= 2)) cnt++;
                    else if ((Math.abs(a2 - i) <= 2 || N - Math.abs(a2 - i) <= 2) && (Math.abs(b2 - k) <= 2 || N - Math.abs(b2 - k) <= 2) && (Math.abs(c2 - j) <= 2 || N - Math.abs(c2 - j) <= 2)) cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}