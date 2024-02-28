import java.util.*;

public class Main {

    // L, U, R, D
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N + 1][N + 1];

        int curX = N;
        int curY = N;

        int curDirec = 0;

        int num = N * N;
        board[curY][curX] = num--;

        while (num > 0) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                board[ny][nx] = num--;
                curX = nx;
                curY = ny;
            } else curDirec = turnDirec(curDirec);
        }

        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static int turnDirec(int curDirec) {
        return (curDirec + 1) % 4;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }
}