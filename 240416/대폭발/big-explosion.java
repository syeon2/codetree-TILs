import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;
    public static int R;
    public static int C;

    public static int[][] board;
    public static int[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        board = new int[N][N];
        memo = new int[N][N];
        board[R][C] = 1;

        for (int m = 1; m <= M; m++) {

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (board[r][c] == 1) {
                        memo[r][c] = 1;
                        simulate(c, r, m);
                    }
                }
            }

            board = memo;
            memo = new int[N][N];
        }

        int ans = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                ans += board[r][c];
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void simulate(int x, int y, int range) {
        for (int i = 0; i < 4; i++) {
            int nx = x + (dx[i] * range);
            int ny = y + (dy[i] * range);

            if (isRange(nx, ny)) memo[ny][nx] = 1;
        }
    }
}