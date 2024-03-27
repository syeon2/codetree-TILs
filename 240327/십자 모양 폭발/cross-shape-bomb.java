import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

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

        int bomb = board[r][c];
        board[r][c] = 0;

        for (int i = 0; i < 4; i++) {
            int curX = c;
            int curY = r;

            int cntBomb = bomb;

            while (cntBomb-- > 1) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny, N)) {
                    board[ny][nx] = 0;

                    curX = nx;
                    curY = ny;
                } else break;
            }
        }

        for (int i = 0; i < N; i++) {
            
            for (int k = N - 1; k >= 0; k--) {
                if (board[k][i] == 0) {

                    for (int j = k - 1; j >= 0; j--) {
                        if (board[j][i] != 0) {
                            board[k][i] = board[j][i];
                            board[j][i] = 0;
                            break;
                        }
                    }
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

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}