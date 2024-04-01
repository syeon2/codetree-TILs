import java.util.*;

public class Main {

    public static int N;

    public static int[][] board;
    public static int[][] direc;

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

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
                direc[i][k] = sc.nextInt() - 1;
            }
        }

        int curY = sc.nextInt() - 1;
        int curX = sc.nextInt() - 1;

        permutation(0, curX, curY);

        System.out.print(ans);
    }

    public static void permutation(int cnt, int x, int y) {

        int move = 1;

        while (true) {
            int d = direc[y][x];

            int nx = x + (dx[d] * move);
            int ny = y + (dy[d] * move);

            if (!isRange(nx, ny)) break;

            if (board[y][x] > board[ny][nx]) {
                move++;
            } else {
                ans = Math.max(ans, cnt + 1);
                permutation(cnt + 1, nx, ny);
                move++;
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}