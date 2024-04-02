import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int ans = 0;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        isVisit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        isVisit[0][0] = true;
        dfs(0, 0);

        System.out.print(ans);
    }

    public static void dfs(int x, int y) {
        if (ans == 1) return;

        if (x == M - 1 && y == N - 1) {
            ans = 1;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && board[ny][nx] != 1 && !isVisit[ny][nx]) {
                isVisit[ny][nx] = true;
                dfs(nx, ny);
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}