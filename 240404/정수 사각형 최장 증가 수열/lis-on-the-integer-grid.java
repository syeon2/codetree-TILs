import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int[][] board;
    public static int[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (memo[i][k] == 0) {
                    dp(k, i);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                ans = Math.max(ans, memo[i][k]);
            }
        }

        System.out.print(ans);
    }

    public static int dp(int x, int y) {
        if (memo[y][x] != 0) return memo[y][x];

        int maxCnt = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && board[ny][nx] > board[y][x]) {
                maxCnt = Math.max(maxCnt, dp(nx, ny) + 1);
            }
        }

        memo[y][x] = maxCnt;
        return memo[y][x];
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}