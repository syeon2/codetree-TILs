import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int Q;

    public static int[][] board;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (Q-- > 0) {            
            int r1 = sc.nextInt() - 1;
            int c1 = sc.nextInt() - 1;

            int r2 = sc.nextInt() - 1;
            int c2 = sc.nextInt() - 1;

            int width = c2 - c1;
            int height = r2 - r1;

            int tempValue = board[r1][c1];

            int curX = c1;
            int curY = r1;

            for (int i = 0; i < 4; i++) {
                int cnt = (i % 2 == 0) ? height : width;

                while (cnt-- > 0) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];

                    board[curY][curX] = board[ny][nx];

                    curX = nx;
                    curY = ny;
                }
            }

            board[curY][curX + 1] = tempValue;

            int[][] memo = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    memo[i][k] = board[i][k];
                }
            }

            for (int i = r1; i <= r2; i++) {
                for (int k = c1; k <= c2; k++) {

                    int sum = board[i][k];
                    int cnt = 1;

                    for (int j = 0; j < 4; j++) {
                        int nx = k + dx[j];
                        int ny = i + dy[j];

                        if (isRange(nx, ny)) {
                            sum += board[ny][nx];
                            cnt++;
                        }
                    }

                    memo[i][k] = sum / cnt;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    board[i][k] = memo[i][k];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}