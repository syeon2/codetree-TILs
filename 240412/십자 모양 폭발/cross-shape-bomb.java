import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;

    public static int R;
    public static int C;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        bomb();

        fallDown();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void fallDown() {
        for (int x = 0; x < N; x++) {

            int idx = N - 1;

            for (int y = N - 1; y >= 0; y--) {
                if (board[y][x] != 0) board[idx--][x] = board[y][x];
            }

            for (int y = idx; y >= 0; y--) {
                board[y][x] = 0;
            }
        }
    }

    public static void bomb() {
        int cnt = board[R][C];
        board[R][C] = 0;

        for (int i = 0; i < 4; i++) {
            int temp = cnt - 1;

            int curX = C;
            int curY = R;

            while (temp-- > 0) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) board[ny][nx] = 0;

                curX = nx;
                curY = ny;
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}