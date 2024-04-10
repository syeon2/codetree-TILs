import java.util.*;

public class Main {

    public static int[][] dx = {{0, 0, 1}, {0, 0, 1}, {-1, 0, 0}, {-1, 0, 0}, {0, 1, 2}, {0, 0, 0}};
    public static int[][] dy = {{-1, 0, 0}, {1, 0, 0}, {0, 0, 1}, {0, 0, -1}, {0, 0, 0}, {0, 1, 2}};

    public static int N;
    public static int M;
    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                int sum = getSum(k, i);

                ans = Math.max(ans, sum);
            }
        }

        System.out.print(ans);
    }

    public static int getSum(int x, int y) {
        int result = 0;

        for (int i = 0; i < 6; i++) {

            int sum = 0;
            boolean flag = true;

            for (int k = 0; k < 3; k++) {
                int nx = x + dx[i][k];
                int ny = y + dy[i][k];

                if (isRange(nx, ny)) sum += board[ny][nx];
                else {
                    flag = false;
                    break;
                }
            }

            if (flag) result = Math.max(result, sum);
        }

        return result;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}