import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        
        int[][] board = new int[N][N];
        int[][] ball = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            int R = sc.nextInt() - 1;
            int C = sc.nextInt() - 1;

            ball[R][C] = 1;
        }

        while (T-- > 0) {
            int[][] copy = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (ball[i][k] == 0) continue;

                    int maxValue = 0;
                    int maxX = 0;
                    int maxY = 0;

                    for (int j = 0; j < 4; j++) {
                        int nx = k + dx[j];
                        int ny = i + dy[j];

                        if (isRange(nx, ny, N) && maxValue < board[ny][nx]) {
                            maxValue = board[ny][nx];
                            maxX = nx;
                            maxY = ny;
                        }
                    }

                    copy[maxY][maxX] += 1;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (copy[i][k] == 1) ball[i][k] = 1;
                    else ball[i][k] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (ball[i][k] == 1) ans++;
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}