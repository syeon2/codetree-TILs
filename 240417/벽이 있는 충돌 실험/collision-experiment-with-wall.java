import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int T;
    public static int N;
    public static int M;

    public static Marble[][] board;
    public static Marble[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        while (T-- > 0) {
            N = sc.nextInt();
            M = sc.nextInt();

            board = new Marble[N][N];
            memo = new Marble[N][N];

            while (M-- > 0) {
                int r = sc.nextInt() - 1;
                int c = sc.nextInt() - 1;

                int direc = getDirec(sc.next().charAt(0));

                board[r][c] = new Marble(direc);
            }

            int cnt = 2 * N;

            while (cnt-- > 0) {
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        if (board[r][c] != null) simulate(c, r);
                    }
                }

                reInit();
            }

            int ans = 0;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (board[r][c] != null) ans++;
                }
            }

            System.out.println(ans);
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void reInit() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (memo[r][c] != null && memo[r][c].isCrashed) memo[r][c] = null;
            }
        }

        board = memo;
        memo = new Marble[N][N];
    }

    public static void simulate(int x, int y) {
        Marble marble = board[y][x];

        int curDirec = marble.direc;

        int nx = x + dx[curDirec];
        int ny = y + dy[curDirec];

        if (isRange(nx, ny) && memo[ny][nx] == null) memo[ny][nx] = marble;
        else if (isRange(nx, ny) && memo[ny][nx] != null) {
            memo[ny][nx].isCrashed = true;
        } else {
            if (memo[y][x] == null) {
                memo[y][x] = marble;
                marble.direc = turnDirec(marble.direc);
            } else {
                memo[y][x].isCrashed = true;
            }
        }
    }

    public static int turnDirec(int direc) {
        if (direc == 0) return 2;
        else if (direc == 1) return 3;
        else if (direc == 2) return 0;
        else return 1;
    }

    public static int getDirec(char direc) {
        if (direc == 'R') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }

    public static class Marble {
        public int direc;
        public boolean isCrashed = false;

        public Marble(int direc) {
            this.direc = direc;
        }
    }
}