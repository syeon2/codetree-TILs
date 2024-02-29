import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, -0, 1, 1, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

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
                if (board[i][k] != 'L') continue;

                for (int j = 0; j < 8; j++) {
                    int curX = k;
                    int curY = i;

                    int cnt = 0;

                    for (int l = 0; l < 2; l++) {
                        int nx = curX + dx[j];
                        int ny = curY + dy[j];

                        if (isRange(nx, ny, N, M) && board[ny][nx] == 'E') {
                            cnt++;
                            curX = nx;
                            curY = ny;
                        }
                        else break;
                    }

                    if (cnt == 2) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N, int M) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}