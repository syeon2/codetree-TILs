import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int K;
    public static int M;

    public static int[][] board;
    public static int[] memo;

    public static List<Pair> stoneList = new ArrayList<>();
    public static Pair[] startNodes;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();

                if (board[r][c] == 1) stoneList.add(new Pair(c, r));
            }
        }

        memo = new int[M];
        startNodes = new Pair[K];

        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            startNodes[k] = new Pair(c, r);
        }

        perm(0, 0);

        System.out.print(ans);
    }

    public static void bfs() {
        Queue<Pair> que = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];

        for (int k = 0; k < K; k++) {
            que.add(startNodes[k]);
            visited[startNodes[k].y][startNodes[k].x] = true;
        }

        int tempSum = que.size();

        while (!que.isEmpty()) {
            Pair node = que.remove();

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] == 0) {
                    tempSum++;
                    visited[ny][nx] = true;
                    que.add(new Pair(nx, ny));
                }
            }
        }

        ans = Math.max(ans, tempSum);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void perm(int idx, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                int nodeIdx = memo[i];

                Pair stone = stoneList.get(nodeIdx);
                board[stone.y][stone.x] = 0;
            }

            bfs();

            for (int i = 0; i < M; i++) {
                int nodeIdx = memo[i];

                Pair stone = stoneList.get(nodeIdx);
                board[stone.y][stone.x] = 1;
            }

            return;
        }

        if (idx == stoneList.size()) return;

        perm(idx + 1, depth);
        memo[depth] = idx;
        perm(idx + 1, depth + 1);
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}