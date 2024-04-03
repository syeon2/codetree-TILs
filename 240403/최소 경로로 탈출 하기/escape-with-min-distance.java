import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];
        boolean[][] memo = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(0, 0, 0));
        memo[0][0] = true;

        int ans = -1;

        while (!que.isEmpty()) {
            Pair node = que.remove();

            int x = node.x;
            int y = node.y;
            int v = node.v;

            if (x == M - 1 && y == N - 1) {
                ans = v;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny, N, M) && !memo[ny][nx] && board[ny][nx] != 0) {
                    memo[ny][nx] = true;
                    que.add(new Pair(nx, ny, v + 1));
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N, int M) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }

    public static class Pair {
        public int x;
        public int y;
        public int v;

        public Pair(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }
}