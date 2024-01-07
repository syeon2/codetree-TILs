import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int m = sc.nextInt();

        int[][] list = new int[N + 1][N + 1];

        int cnt = 1;
        for (int i = 1; i <= m; i++) {

            int r = sc.nextInt();
            int c = sc.nextInt();

            list[r][c] = cnt++;
        }

        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {

                System.out.printf("%d ", list[i][k]);
            }

            System.out.println();
        }
    }
}