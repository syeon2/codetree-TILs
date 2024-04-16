import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static int N;
    public static int M;
    public static int T;

    public static int[][] board;
    public static int[][] marble;
    public static int[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();

        board = new int[N][N];
        marble = new int[N][N];
        memo = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int m = 0; m < M; m++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            marble[r][c] = 1;
        }

        while (T-- > 0) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (marble[r][c] == 1) {

                        simulation(c, r);
                    }
                }
            }

            reInit();
        }

        int ans = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                ans += marble[r][c];
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void reInit() {
        int[][] temp = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (memo[r][c] == 1) temp[r][c] = 1;
            }
        }

        marble = temp;
        memo = new int[N][N];
    }

    public static void simulation(int x, int y) {

        int maxValue = 0;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && maxValue < board[ny][nx]) {
                maxValue = board[ny][nx];

                maxX = nx;
                maxY = ny;
            }
        }

        memo[maxY][maxX] = 1;
    }
}