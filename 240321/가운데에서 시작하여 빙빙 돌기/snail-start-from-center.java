import java.util.*;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];
        int num = N * N;

        int curX = N - 1;
        int curY = N - 1;
        int direc = 0;

        board[curY][curX] = num;

        while (num != 1) {
            int nx = curX + dx[direc];
            int ny = curY + dy[direc];

            if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                board[ny][nx] = --num;

                curX = nx;
                curY = ny;
            } else direc = turnDirec(direc);
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}