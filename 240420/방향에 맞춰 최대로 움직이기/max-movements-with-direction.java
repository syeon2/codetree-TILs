import java.util.*;

public class Main {

    public static int[] dx = {0, 0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {0, -1, -1, 0, 1, 1, 1, 0, -1};

    public static int N;
    public static int[][] board;
    public static int[][] direc;

    public static int R;
    public static int C;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        direc = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                direc[i][k] = sc.nextInt();
            }
        }

        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        perm(C, R, 0);

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void perm(int x, int y, int move) {
        ans = Math.max(ans, move);

        int curValue = board[y][x];
        int curDirec = direc[y][x];

        int curX = x;
        int curY = y;

        while (isRange(curX, curY)) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny) && board[ny][nx] > curValue) {
                perm(nx, ny, move + 1);
            }

            curX = nx;
            curY = ny;
        }
    }
}