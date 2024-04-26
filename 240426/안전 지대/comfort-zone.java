import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;

    public static int[][] board;
    public static boolean[][] visited;

    public static int ansSeaLevel = -1;
    public static int ansArea = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][M];
        visited = new boolean[N][M];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int k = 1; k <= 100; k++) {
            visited = new boolean[N][M];
            int tempArea = 0;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (visited[r][c] || board[r][c] <= k) continue;

                    tempArea++;
                    dfs(c, r, k);
                }
            }

            if (tempArea > ansArea) {
                ansArea = tempArea;
                ansSeaLevel = k;
            }
        }

        System.out.printf("%d %d", ansSeaLevel, ansArea);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }

    public static void dfs(int x, int y, int k) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] > k) {
                dfs(nx, ny, k);
            }
        }
    }
}