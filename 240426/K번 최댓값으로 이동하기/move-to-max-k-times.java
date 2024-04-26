import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int N;
    public static int K;

    public static int[][] board;
    public static boolean[][] visited;

    public static int ansX = -1;
    public static int ansY = -1;

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

        int startY = sc.nextInt() - 1;
        int startX = sc.nextInt() - 1;

        Queue<Pair> ansQue = new LinkedList<>();
        ansQue.add(new Pair(startX, startY));

        while (K-- > 0 && !ansQue.isEmpty()) {
            visited = new boolean[N][N];

            Pair startNode = ansQue.remove();

            Queue<Pair> que = new LinkedList<>();
            que.add(startNode);

            int maxValue = 0;
            int tempX = -1;
            int tempY = -1;

            while (!que.isEmpty()) {
                Pair node = que.remove();
                visited[node.y][node.x] = true;

                for (int i = 0; i < 4; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];

                    if (isRange(nx, ny) && !visited[ny][nx] && board[ny][nx] < board[startNode.y][startNode.x]) {
                        que.add(new Pair(nx, ny));

                        if (maxValue < board[ny][nx] || (maxValue == board[ny][nx] && tempY > ny) || (maxValue == board[ny][nx] && tempY == ny && tempX > nx)) {
                            maxValue = board[ny][nx];
                            tempX = nx;
                            tempY = ny;
                        }
                    }
                }
            }

            if (maxValue == 0) {
                ansQue.add(startNode);
                break;
            } else ansQue.add(new Pair(tempX, tempY));
        }

        Pair node = ansQue.remove();

        ansX = node.x;
        ansY = node.y;

        System.out.printf("%d %d", ansY + 1, ansX + 1);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
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