import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board = new int[n + 1][n + 1];

        int cnt = 1;

        for (int i = 0; i < m; i++) {

            int r = sc.nextInt();
            int c = sc.nextInt();

            board[r][c] = cnt++;
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n; k++) {

                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}