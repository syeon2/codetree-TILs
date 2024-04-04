import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 1; i < N; i++) {
            board[0][i] = Math.min(board[0][i], board[0][i - 1]);
        }

        for (int i = 1; i < N; i++) {
            board[i][0] = Math.min(board[i][0], board[i - 1][0]);
        }

        for (int i = 1; i < N; i++) {
            for (int k = 1; k < N; k++) {
                int max = Math.max(board[i - 1][k], board[i][k - 1]);

                board[i][k] = Math.min(board[i][k], max);
            }
        }

        System.out.print(board[N - 1][N - 1]);
    }
}