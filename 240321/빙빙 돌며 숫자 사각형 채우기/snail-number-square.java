import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];

        int cnt = 1;
        board[0][0] = 1;

        int curX = 0;
        int curY = 0;

        int direc = 0;
        
        while (N * M > cnt) {
            int nx = curX + dx[direc];
            int ny = curY + dy[direc];

            if (isRange(nx, ny, N, M) && board[ny][nx] == 0) {
                board[ny][nx] = ++cnt;

                curX = nx;
                curY = ny;
            } else direc = turnDirec(direc);
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int Y, int X) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;

        return false;
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}