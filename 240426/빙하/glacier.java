import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;

    public static int[][] board;

    public static int ans = 0;
    public static int ansSize = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][M];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        while (canMelting()) {
            bfs();
            ans++;
        }

        System.out.printf("%d %d", ans, ansSize);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }

    public static void bfs() {
        Queue<Pair> que = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        que.add(new Pair(0, 0));
        visited[0][0] = true;

        List<Pair> meltedLand = new ArrayList<>();

        while (!que.isEmpty()) {
            Pair node = que.remove();

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny) && board[ny][nx] == 0 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    que.add(new Pair(nx, ny));
                } else if (isRange(nx, ny) && board[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    meltedLand.add(new Pair(nx, ny));
                }
            }
        }

        ansSize = meltedLand.size();
        for (int i = 0; i < meltedLand.size(); i++) {
            Pair node = meltedLand.get(i);

            board[node.y][node.x] = 0;
        }
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean canMelting() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (board[r][c] == 1) return true;
            }
        }

        return false;
    }
}