import java.util.*;

public class Main {

    public static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    public static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int r1 = sc.nextInt() - 1;
        int c1 = sc.nextInt() - 1;

        int r2 = sc.nextInt() - 1;
        int c2 = sc.nextInt() - 1;

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = Integer.MAX_VALUE;
            }
        }

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(c1, r1));
        board[r1][c1] = 0;

        int ans = -1;

        while (!que.isEmpty()) {
            Pair node = que.remove();

            int x = node.x;
            int y = node.y;
            int v = board[y][x];

            if (x == c2 && y == r2) ans = board[y][x];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny, N) && board[ny][nx] > v + 1) {
                    board[ny][nx] = v + 1;
                    que.add(new Pair(nx, ny));
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

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