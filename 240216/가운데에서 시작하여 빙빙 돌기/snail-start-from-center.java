import java.util.Scanner;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];

        int curDir = 0;
        int curX = N - 1;
        int curY = N - 1;

        board[curY][curX] = N * N;
        for (int i = (N * N) - 1; i >= 1; i--) {
            while (true) {
                int nx = curX + dx[curDir];
                int ny = curY + dy[curDir];

                if (isRange(N, nx, ny) && board[ny][nx] == 0) {
                    board[ny][nx] = i;
                    curX = nx;
                    curY = ny;

                    break;
                } else {
                    curDir = (curDir + 1) % 4;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int N, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}