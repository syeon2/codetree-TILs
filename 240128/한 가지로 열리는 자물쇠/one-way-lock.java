import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {

                for (int j = 1; j <= N; j++) {

                    if ((i >= a - 2 && i <= a + 2) || (k >= b - 2 && k <= b + 2) || (j >= c - 2 && j <= c + 2)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}