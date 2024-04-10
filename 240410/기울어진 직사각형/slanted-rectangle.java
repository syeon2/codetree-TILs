import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;

    public static int[] dx = {1, -1, -1, 1};
    public static int[] dy = {-1, -1, 1, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                
                for (int i = 1; i <= N; i++) {
                    for (int k = 1; k <= N; k++) {

                        int sum = getSum(c, r, k, i);

                        ans = Math.max(ans, sum);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static int getSum(int x, int y, int row, int col) {
        int sum = 0;

        int curX = x;
        int curY = y;

        for (int i = 0; i < 4; i++) {
            int temp = 0;
            if (i % 2 == 0) temp = row;
            else temp = col;

            while (temp-- > 0) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) sum += board[ny][nx];
                else return 0;

                curX = nx;
                curY = ny;
            }
        }

        return sum;
    }

    public static boolean isRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}