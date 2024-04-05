import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];
        int[][] memo = new int[N][M];
        memo[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int r1 = 1; r1 < N; r1++) {
            for (int c1 = 1; c1 < M; c1++) {

                int target = board[r1][c1];

                int max = 0;

                for (int r2 = 0; r2 < r1; r2++) {
                    for (int c2 = 0; c2 < c1; c2++) {
                        if (target > board[r2][c2] && memo[r2][c2] != 0) {
                            max = Math.max(max, memo[r2][c2] + 1);
                        }
                    }
                }

                memo[r1][c1] = max;
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                max = Math.max(max, memo[i][k]);
            }
        }

        System.out.print(max);
    }
}