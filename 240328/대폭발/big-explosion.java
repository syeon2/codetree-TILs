import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;

        int[][] board = new int[N][N];
        int[][] memo = new int[N][N];
        board[R][C] = 1;
        memo[R][C] = 1;

        int t = 1;
        int dist = 1;

        while (t++ <= M) {
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (board[i][k] == 1) {

                        int curX = k;
                        int curY = i;

                        for (int j = 0; j < 4; j++) {
                            int nx = curX + (dx[j] * dist);
                            int ny = curY + (dy[j] * dist);

                            if (isRange(nx, ny, N)) memo[ny][nx] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    board[i][k] = memo[i][k];
                }
            }

            dist = getDist(t);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (board[i][k] == 1) ans++;
            }
        }

        System.out.print(ans);
    }

    public static int getDist(int t) {
        int prod = 1;

        while (t-- > 1) {
            prod *= 2;
        }

        return prod;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}