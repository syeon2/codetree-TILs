import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int K;

    public static int[][] board;
    public static boolean[][] visited;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        board = new int[N][N];
        visited = new boolean[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        Queue<Pair> que = new LinkedList<>();

        while (K-- > 0) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            que.add(new Pair(c, r));
            visited[r][c] = true;
            ans++;
        }

        while (!que.isEmpty()) {
            Pair node = que.remove();

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] == 0) {
                    visited[ny][nx] = true;
                    ans++;
                    que.add(new Pair(nx, ny));
                }
            }
        }

        System.out.print(ans);
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}