import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        int[][] memo = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                if (memo[r][c] == 0) {
                    memo[r][c] = 1;

                    Queue<Pair> que = new LinkedList<>();
                    que.add(new Pair(c, r));

                    while (!que.isEmpty()) {
                        Pair node = que.remove();

                        int x = node.x;
                        int y = node.y;

                        for (int i = 0; i < 4; i++) {
                            int nx = x + dx[i];
                            int ny = y + dy[i];

                            if (isRange(nx, ny, N) && board[y][x] < board[ny][nx]) {
                                if (memo[ny][nx] < memo[y][x] + 1) {
                                    memo[ny][nx] = memo[y][x] + 1;
                                    que.add(new Pair(nx, ny));
                                }
                            }
                        }
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                ans = Math.max(ans, memo[i][k]);
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