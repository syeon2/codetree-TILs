import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ansX = c;
        int ansY = r;

        while (true) {
            System.out.printf("%d ", board[ansY][ansX]);

            int curX = ansX;
            int curY = ansY;

            int maxValue = board[curY][curX];
            int nextDirec = -1;

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny, N) && board[ny][nx] > maxValue) {
                    maxValue = board[ny][nx];
                    nextDirec = i;
                    break;
                }
            }

            if (nextDirec == -1) break;
            else {
                ansX = curX + dx[nextDirec];
                ansY = curY + dy[nextDirec];
            }
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}