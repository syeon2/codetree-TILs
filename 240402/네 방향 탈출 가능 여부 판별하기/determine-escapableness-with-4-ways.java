import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int M;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int ans = 0;

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

        Queue<Pos> que = new LinkedList<>();
        isVisit[0][0] = true;
        que.add(new Pos(0, 0));

        while (!que.isEmpty()) {
            Pos node = que.remove();

            int x = node.x;
            int y = node.y;
            if (x == M - 1 && y == N - 1) {
                ans = 1;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny) && !isVisit[ny][nx] && board[ny][nx] == 1) {
                    isVisit[ny][nx] = true;
                    que.add(new Pos(nx, ny));
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

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