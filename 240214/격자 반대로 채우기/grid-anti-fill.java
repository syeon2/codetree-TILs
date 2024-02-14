import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] board = new int[n + 1][n + 1];

        int cnt = 1;

        for (int i = n; i >= 1; i--) {

            if ((n % 2 == 0 && i % 2 == 0) || (n % 2 == 1 && i % 2 == 1)) {
                for (int k = n; k >= 1; k--) {
                    board[k][i] = cnt++;
                }
            } else {
                for (int k = 1; k <= n; k++) {
                    board[k][i] = cnt++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n; k++) {

                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}