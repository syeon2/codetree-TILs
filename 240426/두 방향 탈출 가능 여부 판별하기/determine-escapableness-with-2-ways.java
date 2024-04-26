import java.util.*;

public class Main {

    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};

    public static int N;
    public static int M;

    public static int[][] board;
    public static boolean[][] visited;

    public static int canGo = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][M];
        visited = new boolean[N][M];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        dfs(new Node(0, 0));

        System.out.print(canGo);
    }

    public static void dfs(Node node) {
        if ((node.x == M - 1 && node.y == N - 1) || canGo == 1) {
            canGo = 1;
            return;
        }

        for (int i = 0; i < 2; i++) {
            int nx = node.x + dx[i];
            int ny = node.y + dy[i];

            if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] == 1) {
                visited[ny][nx] = true;
                dfs(new Node(nx, ny));
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }

    public static class Node {
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}