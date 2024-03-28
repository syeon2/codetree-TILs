import java.util.*;

public class Main {

    public static int[][] board;
    public static int N;

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

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
                int cnt = explosion(r, c);

                ans = Math.max(ans, cnt);
            }
        }

        System.out.print(ans);
    }

    public static int explosion(int r, int c) {
        int[][] copy = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                copy[i][k] = board[i][k];
            }
        }

        int bombs = copy[r][c];
        copy[r][c] = 0;

        for (int i = 0; i < 4; i++) {
            int curX = c;
            int curY = r;

            int bomb = bombs;

            while (bomb-- > 1) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (isRange(nx, ny)) {
                    board[ny][nx] = 0;

                    curX = nx;
                    curY = ny;
                } else break;
            }
        }

        drop(copy);
        
        return counting(copy);
    }

    public static int counting(int[][] copy) {
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                int value = copy[i][k];

                if (value == 0) continue;
                
                if (isRange(k + 1, i) && copy[i][k + 1] == value) cnt++;
                if (isRange(i + 1, k) && copy[i + 1][k] == value) cnt++;
            }
        }

        return cnt;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void drop(int[][] copy) {
        for (int c = 0; c < N; c++) {

            for (int r = N - 1; r >= 0; r--) {
                if (copy[r][c] != 0) continue;

                for (int i = r - 1; i >= 0; i--) {
                    if (copy[i][c] == 0) continue;

                    copy[r][c] = copy[i][c];
                    copy[i][c] = 0;
                    break;
                }
            }
        }
    }
}