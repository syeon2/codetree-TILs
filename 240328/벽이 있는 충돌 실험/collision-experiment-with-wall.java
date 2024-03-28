import java.util.*;

public class Main {

    public static int[] dx = {0, 0, 0, -1, 1};
    public static int[] dy = {0, -1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] board = new int[N][N];
            for (int i = 0; i < M; i++) {
                int R = sc.nextInt() - 1;
                int C = sc.nextInt() - 1;

                int direc = getDirec(sc.next().charAt(0));

                board[R][C] = direc;
            }

            int sec = 0;
            while (sec++ <= 2 * N) {

                int[][] memo = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int k = 0; k < N; k++) {
                        if (board[i][k] == 0) continue;

                        int direc = board[i][k];

                        int nx = k + dx[direc];
                        int ny = i + dy[direc];

                        if (isRange(nx, ny, N) && memo[ny][nx] == 0) {
                            memo[ny][nx] = direc;
                        } else if (isRange(nx, ny, N)) {
                            memo[ny][nx] = 0;
                        } else {
                            if (memo[i][k] == 0) memo[i][k] = turnDirec(direc);
                            else memo[i][k] = 0;
                        }
                    }
                }

                board = memo;
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (board[i][k] != 0) ans++;
                }
            }

            System.out.println(ans);
        }
    }

    public static int turnDirec(int direc) {
        if (direc == 1) return 2;
        else if (direc == 2) return 1;
        else if (direc == 3) return 4;
        else return 3;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 1;
        else if (direc == 'D') return 2;
        else if (direc == 'L') return 3;
        else return 4;
    }
}