import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;

    public static int[][] board;
    public static int[][] step;
    public static boolean[][] visited;

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

        step = new int[N][M];
        visited = new boolean[N][M];

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(0, 0));
        visited[0][0] = true;

        while (!que.isEmpty()) {
            Pair node = que.remove();

            if (node.x == M - 1 && node.y == N - 1) break;

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny) && board[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    step[ny][nx] = step[node.y][node.x] + 1;
                    que.add(new Pair(nx, ny));
                }
            }
        }

        if (step[N - 1][M - 1] == 0) System.out.print(-1);
        else System.out.print(step[N - 1][M - 1]);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
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