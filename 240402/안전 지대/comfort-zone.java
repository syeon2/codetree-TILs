import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int M;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int ans = 0;
    public static int ansMax = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        isVisit = new boolean[N][M];

        int K = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                board[r][c] = sc.nextInt();
                K = Math.max(K, board[r][c]);
            }
        }

        while (K > 0) {
            isVisit = new boolean[N][M];

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    if (!isVisit[i][k] && board[i][k] > K) {
                        cnt++;
                        dfs(k, i, K);
                    }
                }
            }

            if (ansMax <= cnt) {
                ansMax = cnt;
                ans = K;
            }

            K--;
        }

        System.out.printf("%d %d", ans, ansMax);
    }

    public static void dfs(int x, int y, int K) {
        isVisit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !isVisit[ny][nx] && board[ny][nx] > K) {
                dfs(nx, ny, K);
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}