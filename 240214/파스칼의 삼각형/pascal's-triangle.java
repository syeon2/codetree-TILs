import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] board = new int[n + 1][n + 1];

        board[1][1] = 1;

        for (int i = 2; i <= n; i++) {

            for (int k = 1; k <= n; k++) {
                board[i][k] = board[i - 1][k - 1] + board[i - 1][k];
            }
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}