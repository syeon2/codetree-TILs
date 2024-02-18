import java.util.Scanner;

public class Main {

    public static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    public static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // N == R == y
        // M == C == x
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int k = 0; k < M; k++) {
                board[i][k] = str.charAt(k);
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (board[i][k] == 'L') {

                    int curX = k;
                    int curY = i;

                    for (int q = 0; q < 8; q++) {
                        
                        int cnt = 0;

                        for (int z = 1; z <= 2; z++) {
                            int nx = curX + (dx[q] * z);
                            int ny = curY + (dy[q] * z);

                            if (isRange(N, M, nx, ny) && board[ny][nx] == 'E') cnt++;
                        }

                        if (cnt >= 2) ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int R, int C, int x, int y) {
        if (x >= 0 && x < C && y >= 0 && y < R) return true;

        return false;
    }
}