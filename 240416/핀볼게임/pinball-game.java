import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;

    public static int[][] board;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        // D
        for (int c = 0; c < N; c++) {
            int curX = c;
            int curY = 0;

            int direc = (board[curY][curX] != 0) ? turnDirec(1, board[curY][curX]) : 1;
            int sec = simulate(curX, curY, direc);

            ans = Math.max(ans, sec);
        }

        // L
        for (int r = 0; r < N; r++) {
            int curX = N - 1;
            int curY = r;

            int direc = (board[curY][curX] != 0) ? turnDirec(2, board[curY][curX]) : 2;
            int sec = simulate(curX, curY, direc);

            ans = Math.max(ans, sec);
        }

        // U
        for (int c = 0; c < N; c++) {
            int curX = c;
            int curY = N - 1;

            int direc = (board[curY][curX] != 0) ? turnDirec(3, board[curY][curX]) : 3;

            int sec = simulate(curX, curY, direc);

            ans = Math.max(ans, sec);
        }

        // R
        for (int r = 0; r < N; r++) {
            int curX = 0;
            int curY = r;

            int direc = (board[curY][curX] != 0) ? turnDirec(0, board[curY][curX]) : 0;

            int sec = simulate(curX, curY, direc);

            ans = Math.max(ans, sec);
        }

        System.out.print(ans);
    }

    public static int simulate(int x, int y, int direc) {
        int sec = 1;

        int curX = x;
        int curY = y;

        int curDirec = direc;

        while (true) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny) && board[ny][nx] == 0) {
                sec++;

                curX = nx;
                curY = ny;
            } else if (isRange(nx, ny) && board[ny][nx] != 0) {
                sec++;

                curX = nx;
                curY = ny;

                curDirec = turnDirec(curDirec, board[ny][nx]);
            } else {
                sec++;

                break;
            }
        }

        return sec;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int turnDirec(int direc, int bar) {
        if (direc == 0) {
            if (bar == 1) return 3;
            else return 1;
        } else if (direc == 1) {
            if (bar == 1) return 2;
            else return 0;
        } else if (direc == 2) {
            if (bar == 1) return 1;
            else return 3;
        } else {
            if (bar == 1) return 0;
            else return 2;
        }
    }
}