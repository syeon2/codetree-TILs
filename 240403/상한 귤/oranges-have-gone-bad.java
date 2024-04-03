import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] board = new int[N][N];
        int[][] visited = new int[N][N];

        Queue<Pair> que = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();

                if (board[i][k] == 2) {
                    que.add(new Pair(k, i, 0));
                    visited[i][k] = 0;
                } else visited[i][k] = -1;
            }
        }

        while (!que.isEmpty()) {
            Pair node = que.remove();

            int x = node.x;
            int y = node.y;
            int t = node.t;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny, N) && board[ny][nx] != 0 && visited[ny][nx] == -1) {
                    visited[ny][nx] = t + 1;
                    que.add(new Pair(nx, ny, t + 1));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (board[i][k] == 1 && visited[i][k] == -1) visited[i][k] = -2;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", visited[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static class Pair {
        public int x;
        public int y;
        public int t;

        public Pair(int x, int y, int t) {
            this.x = x;
            this.y = y;
            this.t = t;
        }
    }
}