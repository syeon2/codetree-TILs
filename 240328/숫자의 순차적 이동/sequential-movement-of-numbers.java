import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (M-- > 0) {
            int cnt = 1;

            while (cnt <= N * N) {
                for (int i = 0; i < N; i++) {
                    boolean isEnd = false;

                    for (int k = 0; k < N; k++) {
                        if (board[i][k] == cnt) {

                            int maxValue = 0;
                            int maxX = 0;
                            int maxY = 0;

                            for (int j = 0; j < 8; j++) {
                                int nx = k + dx[j];
                                int ny = i + dy[j];

                                if (isRange(nx, ny, N) && board[ny][nx] > maxValue) {
                                    maxValue = board[ny][nx];
                                    maxX = nx;
                                    maxY = ny;
                                }
                            }

                            int temp = board[i][k];
                            board[i][k] = board[maxY][maxX];
                            board[maxY][maxX] = temp;

                            isEnd = true;
                            break;
                        }
                    }

                    if (isEnd) break;
                }

                cnt++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0 ; k < N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}