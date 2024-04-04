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

        for (int i = N - 1; i >= 1; i--) {
            board[0][i - 1] += board[0][i];
        }

        for (int i = 0; i < N - 1; i++) {
            board[i + 1][N - 1] += board[i][N - 1];
        }

        for (int i = 1; i < N; i++) {
            for (int k = N - 2; k >= 0; k--) {
                int min = Math.min(board[i - 1][k], board[i][k + 1]);

                board[i][k] += min;
            }
        }

        System.out.print(board[N - 1][0]);
    }
}