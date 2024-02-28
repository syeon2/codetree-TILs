import java.util.*;

public class Main {

    // D, R, U, L
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];

        int num = 1;

        int curX = 0;
        int curY = 0;
        board[0][0] = num++;

        int curDirec = 0;

        while (num <= N * M) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny, N, M) && board[ny][nx] == 0) {
                board[ny][nx] = num++;

                curX = nx;
                curY = ny;
            } else curDirec = turnDirec(curDirec);
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }

    public static boolean isRange(int x, int y, int N, int M) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}