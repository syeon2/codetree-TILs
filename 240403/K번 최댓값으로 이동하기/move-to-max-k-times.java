import java.util.*;

public class Main {

    public static int[] dx = {0, -1, 1, 0};
    public static int[] dy = {-1, 0, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int curY = sc.nextInt() - 1;
        int curX = sc.nextInt() - 1;

        int curValue = board[curY][curX];

        while (K-- > 0) {
            Queue<Pair> que = new LinkedList<>();
            boolean[][] isVisit = new boolean[N][N];

            que.add(new Pair(curX, curY));
            isVisit[curY][curX] = true;

            int nextX = -1;
            int nextY = -1;
            int nextValue = -1;

            int targetValue = board[curY][curX];

            while (!que.isEmpty()) {
                Pair node = que.remove();

                int x = node.x;
                int y = node.y;
                int v = board[y][x];

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (isRange(nx, ny, N) && board[ny][nx] < targetValue && !isVisit[ny][nx]) {
                        isVisit[ny][nx] = true;
                        que.add(new Pair(nx, ny));

                        if (nextValue == board[ny][nx]) {
                            if (nextY == ny) {
                                if (nextX > nx) {
                                    nextX = nx;
                                    nextY = ny;
                                    nextValue = board[ny][nx];
                                }
                            } else if (nextY > ny) {
                                nextX = nx;
                                nextY = ny;
                                nextValue = board[ny][nx];
                            }
                        } else if (nextValue < board[ny][nx]) {
                            nextX = nx;
                            nextY = ny;
                            nextValue = board[ny][nx];
                        }
                    }
                }
            }

            if (nextValue == -1) break;
            else {
                curX = nextX;
                curY = nextY;
                curValue = nextValue;
            }
        }

        System.out.printf("%d %d", curY + 1, curX + 1);
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