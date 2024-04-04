import java.util.*;

public class Main {

    public static int[] dx = {0, -1};
    public static int[] dy = {-1, 0};

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

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {

                int max = 0;

                for (int j = 0; j < 2; j++) {
                    int nx = k + dx[j];
                    int ny = i + dy[j];

                    if (isRange(nx, ny, N)) max = Math.max(max, board[ny][nx]);
                }

                board[i][k] += max;
            }
        }

        System.out.print(board[N - 1][N - 1]);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}