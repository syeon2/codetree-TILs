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

        int ans = 0;

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                boolean isPossible = true;
                int sum = 0;

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (!isRange(nx, ny, N)) isPossible = false;
                    else sum += board[ny][nx];
                }

                if (!isPossible) continue;

                int tempSum1 = sum;
                int nx = x - 1;
                int ny = y + 1;

                while (isRange(nx, ny, N) && isRange(nx - 1, ny, N) && isRange(nx, ny + 1, N)) {
                    tempSum1 += board[ny][nx - 1] + board[ny + 1][nx];

                    nx--;
                    ny++;
                }

                int tempSum2 = sum;
                nx = x + 1;
                ny = y + 1;

                while (isRange(nx, ny, N) && isRange(nx + 1, ny, N) && isRange(nx, ny + 1, N)) {
                    tempSum2 += board[ny][nx + 1] + board[ny + 1][nx];

                    nx++;
                    ny++;
                }

                ans = Math.max(ans, Math.max(tempSum1, tempSum2));
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}