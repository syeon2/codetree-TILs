import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int K;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static Queue<Pos> que = new LinkedList<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < K; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            que.add(new Pos(c, r));
        }

        while (!que.isEmpty()) {
            Pos node = que.remove();

            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny) && !isVisit[ny][nx] && board[ny][nx] == 0) {
                    isVisit[ny][nx] = true;
                    que.add(new Pos(nx, ny));
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (isVisit[i][k]) ans++;
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}