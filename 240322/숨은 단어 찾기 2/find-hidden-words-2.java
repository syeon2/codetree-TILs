import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        for (int n = 0; n < N; n++) {
            char[] list = sc.next().toCharArray();

            for (int m = 0; m < M; m++) {
                board[n][m] = list[m];
            }
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (board[i][k] != 'L') continue;

                for (int j = 0; j < 8; j++) {
                    int x = k;
                    int y = i;

                    int cnt = 2;

                    while (cnt > 0) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if (!isRange(nx, ny, M, N) || board[ny][nx] != 'E') break;

                        cnt--;
                        x = nx;
                        y = ny;
                    }

                    if (cnt == 0) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int X, int Y) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;

        return false;
    }
}