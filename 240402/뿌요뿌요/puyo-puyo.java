import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int blockCnt = 0;
    public static int maxBlock = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (!isVisit[i][k]) {
                    int cnt = dfs(k, i, board[i][k]) + 1;

                    if (cnt >= 4) blockCnt++;
                    maxBlock = Math.max(maxBlock, cnt);
                }
            }
        }

        System.out.printf("%d %d", blockCnt, maxBlock);
    }

    public static int dfs(int x, int y, int value) {
        int temp = 0;

        isVisit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !isVisit[ny][nx] && board[ny][nx] == value) {
                temp += dfs(nx, ny, value) + 1;
            }
        }

        return temp;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}