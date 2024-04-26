import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int[][] board;
    public static boolean[][] visited;

    public static int ansBlockCnt = 0;
    public static int ansBlockArea = 0;
    public static int tempBlockArea = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (visited[r][c]) continue;

                int block = board[r][c];
                dfs(c, r, block);

                if (tempBlockArea >= 4) {
                    ansBlockCnt++;
                    ansBlockArea = Math.max(ansBlockArea, tempBlockArea);
                }

                tempBlockArea = 0;
            }
        }

        System.out.printf("%d %d", ansBlockCnt, ansBlockArea);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void dfs(int x, int y, int block) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] == block) {
                tempBlockArea++;
                visited[ny][nx] = true;
                dfs(nx, ny, block);
            }
        }
    }
}