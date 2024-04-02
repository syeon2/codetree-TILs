import java.util.*;

public class Main {

    public static int[] dx = {0, -1, 1, 0};
    public static int[] dy = {-1, 0, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Queue<Pos> que = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ansY = sc.nextInt() - 1;
        int ansX = sc.nextInt() - 1;

        int value = board[ansY][ansX];
        que.add(new Pos(ansX, ansY));

        while (K-- > 0 && !que.isEmpty()) {
            Pos node = que.remove();

            int tempX = node.x;
            int tempY = node.y;
            value = board[tempY][tempX];

            int maxValue = 0;

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (isRange(nx, ny, N) && value > board[ny][nx] && maxValue < board[ny][nx]) {
                    tempX = nx;
                    tempY = ny;

                    maxValue = board[ny][nx];
                }
            }

            if (tempX == node.x && tempY == node.y) break;

            for (int i = N - 1; i >= 0; i--) {
                for (int k = N - 1; k >= 0; k--) {
                    if (maxValue == board[i][k]) {
                        tempX = k;
                        tempY = i;
                    }
                }
            }

            que.add(new Pos(tempX, tempY));
            ansX = tempX;
            ansY = tempY;
        }

        System.out.printf("%d %d", ansY + 1, ansX + 1);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}