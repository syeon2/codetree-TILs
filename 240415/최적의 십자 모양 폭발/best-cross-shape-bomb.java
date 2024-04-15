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
        
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                initialize();

                bomb(c, r);
                drop();
                
                for (int i = 1; i <= 2; i++) {
                    int nx = c + dx[i];
                    int ny = r + dy[i];

                    if (isRange(nx, ny) && memo[ny][nx] == memo[r][c]) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static void drop() {
        int[][] memo2 = new int[N][N];

        for (int c = 0; c < N; c++) {
            int idx = N - 1;

            for (int r = N - 1; r >= 0; r--) {
                if (memo[r][c] != 0) memo2[idx--][c] = memo[r][c];
            }
        }

        memo = memo2;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void bomb(int x, int y) {
        int cnt = memo[y][x];

        for (int i = 0; i < 4; i++) {
            int curX = x;
            int curY = y;

            while (cnt-- > 0) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) memo[ny][nx] = 0;

                curX = nx;
                curY = ny;
            }
        }
    }

    public static void initialize() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                memo[r][c] = board[r][c];
            }
        }
    }
}