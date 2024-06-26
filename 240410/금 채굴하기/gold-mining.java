import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] board;

    public static int[] dx = {-1, 1, 1, -1};
    public static int[] dy = {1, 1, -1, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int cnt = 0;

                for (int k = 0; k <= N; k++) {
                    cnt += getGoldCnt(c, r, k);

                    if ((cnt * M) >= getCost(k)) ans = Math.max(ans, cnt);
                }
            }
        }

        System.out.print(ans);
    }

    public static int getGoldCnt(int x, int y, int k) {
        if (k == 0) return board[y][x];

        int cnt = 0;

        int curX = x;
        int curY = y - k;

        for (int i = 0; i < 4; i++) {
            int temp = k;

            while (temp-- > 0) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) cnt += board[ny][nx];

                curX = nx;
                curY = ny;
            }
        }

        return cnt;
    }

    public static boolean isRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    public static int getCost(int k) {
        return ((k * k) + ((k + 1) * (k + 1)));
    }
}