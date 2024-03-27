import java.util.*;

public class Main {

    public static int[] dx = {1, -1, -1, 1};
    public static int[] dy = {-1, -1, 1, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        int[] move = new int[4];
        for (int i = 0; i < 4; i++) {
            move[i] = sc.nextInt();
        }

        int dir = sc.nextInt();

        if (dir == 0) {
            int curX = c;
            int curY = r;

            int prevValue = board[curY][curX];

            for (int i = 0; i < 4; i++) {
                int moving = move[i];

                while (moving-- > 0) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];

                    int temp = board[ny][nx];
                    board[ny][nx] = prevValue;
                    prevValue = temp;

                    curX = nx;
                    curY = ny;
                }
            }
        } else {
            int curX = c;
            int curY = r;

            int prevValue = board[curY][curX];

            for (int i = 3; i >= 0; i--) {
                int moving = move[i];

                while (moving-- > 0) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];

                    int temp = board[ny][nx];
                    board[ny][nx] = prevValue;
                    prevValue = temp;

                    curX = nx;
                    curY = ny;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}