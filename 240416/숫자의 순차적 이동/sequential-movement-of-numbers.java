import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static int N;
    public static int M;

    public static int[][] board;

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

        while (M-- > 0) {
            int num = 1;

            while (num <= N * N) {
                boolean isChanged = false;
                
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        if (board[r][c] == num) {
                            simultate(c, r);
                            isChanged = true;
                            break;
                        }
                    }

                    if (isChanged) break;
                }

                num++;
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                System.out.printf("%d ", board[r][c]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void simultate(int x, int y) {
        int maxValue = 0;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && maxValue < board[ny][nx]) {
                maxValue = board[ny][nx];

                maxX = nx;
                maxY = ny;
            }
        }

        int temp = board[y][x];
        board[y][x] = board[maxY][maxX];
        board[maxY][maxX] = temp;
    }
}