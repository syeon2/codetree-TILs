import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];
        board[0][0] = 1;

        int startX = 0;
        int startY = 0;
        int direc = 0;

        int cnt = 2;

        while (cnt <= N * M) {
            int nx = startX + dx[direc];
            int ny = startY + dy[direc];

            if (isRange(nx, ny, M, N) && board[ny][nx] == 0) {
                board[ny][nx] = cnt++;

                startX = nx;
                startY = ny;
            } else direc = turnDirec(direc);
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int X, int Y) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}