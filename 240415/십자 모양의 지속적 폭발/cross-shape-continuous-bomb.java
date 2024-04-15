import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int M;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int m = 0; m < M; m++) {
            int col = sc.nextInt() - 1;

            bomb(col);
            drop();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void drop() {
        for (int c = 0; c < N; c++) {
            for (int r = N - 1; r >= 0; r--) {
                if (board[r][c] != 0) continue;

                for (int r2 = r - 1; r2 >= 0; r2--) {
                    if (board[r2][c] == 0) continue;

                    board[r][c] = board[r2][c];
                    board[r2][c] = 0;
                    break;
                }
            }
        }
    }

    public static void bomb(int col) {
        for (int r = 0; r < N; r++) {
            if (board[r][col] == 0) continue;

            for (int i = 0; i < 4; i++) {
                int curX = col;
                int curY = r;

                int cnt = board[r][col];
                
                while (cnt-- > 1) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];

                    if (isRange(nx, ny)) board[ny][nx] = 0;

                    curX = nx;
                    curY = ny;
                }
            }

            board[r][col] = 0;
            break;
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}