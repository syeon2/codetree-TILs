import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[] memo;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new boolean[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        recur(0, 0, 0);

        System.out.print(ans);
    }

    public static void recur(int nextY, int sum, int depth) {
        if (depth == N) {
            ans = Math.min(ans, sum);
            return;
        }

        if (depth == N - 1) {
            recur(nextY, sum + board[nextY][0], depth + 1);
        } else {
            for (int i = 1; i < N; i++) {
                if (nextY == i || memo[i]) continue;

                memo[i] = true;
                recur(i, sum + board[nextY][i], depth + 1);
                memo[i] = false;
            }
        }
    }
}