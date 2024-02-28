import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N + 1][N + 1];

        for (int m = 0; m < M; m++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            board[r][c] = 1;

            int cnt = 0;
            for (int i = 0; i < 4; i++) {
                int nx = c + dx[i];
                int ny = r + dy[i];

                if (isRange(nx, ny, N) && board[ny][nx] == 1) cnt++;
            }

            if (cnt == 3) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }
}