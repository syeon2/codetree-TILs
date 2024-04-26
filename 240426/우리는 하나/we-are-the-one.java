import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int K;
    public static int U;
    public static int D;

    public static int[][] board;
    public static boolean[][] visited;
    public static Pair[] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        U = sc.nextInt();
        D = sc.nextInt();

        memo = new Pair[K];

        board = new int[N][N];
        visited = new boolean[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        perm(0);

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void bfs() {
        Queue<Pair> que = new LinkedList<>();
        boolean[][] tempVisited = new boolean[N][N];

        for (int i = 0; i < K; i++) {
            que.add(memo[i]);
            tempVisited[memo[i].y][memo[i].x] = true;
        }

        int sum = que.size();

        while (!que.isEmpty()) {
            Pair node = que.remove();
            int height = board[node.y][node.x];

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny) && compHeight(height, board[ny][nx]) && !tempVisited[ny][nx]) {
                    tempVisited[ny][nx] = true;
                    que.add(new Pair(nx, ny));
                    sum++;
                }
            }
        }

        ans = Math.max(ans, sum);
    }

    public static boolean compHeight(int a, int b) {
        int sub = Math.abs(a - b);

        if (sub >= U && sub <= D) return true;
        else return false;
    }

    public static void perm(int depth) {
        if (depth == K) {
            bfs();
            return;
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (visited[r][c]) continue;

                visited[r][c] = true;
                memo[depth] = new Pair(c, r);
                perm(depth + 1);
                visited[r][c] = false;
            }
        }
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}