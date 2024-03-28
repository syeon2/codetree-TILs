import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static int[][] board;
    public static int N;
    public static int M;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        for (int m = 0; m < M; m++) {
            int column = sc.nextInt() - 1;

            int curY = -1;
            int curX = column;

            for (int r = 0; r < N; r++) {
                if (board[r][column] != 0) {
                    curY = r;
                    break;
                }
            }

            if (curY == -1) continue;

            int bombs = board[curY][curX];
            board[curY][curX] = 0;

            for (int i = 0; i < 4; i++) {
                int bomb = bombs;

                int tempX = curX;
                int tempY = curY;

                while (bomb-- > 1) {
                    int nx = tempX + dx[i];
                    int ny = tempY + dy[i];

                    if (isRange(nx, ny, N)) {
                        board[ny][nx] = 0;
                        
                        tempX = nx;
                        tempY = ny;
                    } else break;
                }
            }

            for (int c = 0; c < N; c++) {
                for (int r = N - 1; r >= 0; r--) {
                    if (board[r][c] != 0) continue;

                    for (int i = r - 1; i >= 0; i--) {
                        if (board[i][c] == 0) continue;

                        board[r][c] = board[i][c];
                        board[i][c] = 0;
                        break;
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