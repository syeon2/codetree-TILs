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

        int[][][] memo = new int[N][N][2];
        memo[0][0][0] = memo[0][0][1] = board[0][0];

        for (int i = 1; i < N; i++) {
            memo[0][i][0] = Math.min(memo[0][i - 1][0], board[0][i]);
            memo[0][i][1] = Math.max(memo[0][i - 1][1], board[0][i]);

            memo[i][0][0] = Math.min(memo[i - 1][0][0], board[i][0]);
            memo[i][0][1] = Math.max(memo[i - 1][0][1], board[i][0]);
        }

        for (int i = 1; i < N; i++) {
            for (int k = 1; k < N; k++) {
                int case1 = Math.max(memo[i - 1][k][1], board[i][k]) - Math.min(memo[i - 1][k][0], board[i][k]);
                int case2 = Math.max(memo[i][k - 1][1], board[i][k]) - Math.min(memo[i][k - 1][0], board[i][k]);

                if (case1 < case2) {
                    memo[i][k][0] = Math.min(memo[i - 1][k][0], board[i][k]);
                    memo[i][k][1] = Math.max(memo[i - 1][k][1], board[i][k]);
                } else {
                    memo[i][k][0] = Math.min(memo[i][k - 1][0], board[i][k]);
                    memo[i][k][1] = Math.max(memo[i][k - 1][1], board[i][k]);
                }
            }
        }

        int sub = memo[N - 1][N - 1][1] - memo[N - 1][N - 1][0];

        System.out.print(sub);
    }
}