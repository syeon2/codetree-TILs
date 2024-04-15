import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;

    public static int[][] board;
    public static int[][] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                initialize();
                bomb(c, r);

                drop();

                checkPair();
            }
        }

        System.out.print(ans);
    }

    public static void checkPair() {
        int temp = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int value = memo[r][c];

                if (value == 0) continue;

                if (isRange(c, r + 1) && memo[r + 1][c] == value) temp++;
                if (isRange(c + 1, r) && memo[r][c + 1] == value) temp++;
            }
        }

        ans = Math.max(ans, temp);
    }

    public static void drop() {
        for (int c = 0; c < N; c++) {
            int[] temp = new int[N];

            int idx = N - 1;

            for (int r = N - 1; r >= 0; r--) {
                if (memo[r][c] != 0) temp[idx--] = memo[r][c];
            }

            for (int r = 0; r < N; r++) {
                memo[r][c] = temp[r];
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void initialize() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                memo[r][c] = board[r][c];
            }
        }
    }

    public static void bomb(int x, int y) {
        int cnt = memo[y][x];
        memo[y][x] = 0;

        for (int i = 0; i < 4; i++) {
            int curX = x;
            int curY = y;

            int temp = cnt;

            while (temp-- > 1) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) memo[ny][nx] = 0;

                curX = nx;
                curY = ny;
            }
        }
    }
}