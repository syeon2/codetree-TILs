import java.util.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    // 1 -> /, 2 -> \
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

        int ans = 0;

        // 아래로 
        for (int i = 0; i < N; i++) {
            int curX = i;
            int curY = 0;

            int direc = 1;
            if (board[curY][curX] != 0) {
                direc = turnDirec(direc, board[curY][curX]);
            }

            int sec = 1;
            while (true) {
                sec++;

                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                    curX = nx;
                    curY = ny;
                } else if (isRange(nx, ny, N) && board[ny][nx] != 0) {
                    direc = turnDirec(direc, board[ny][nx]);

                    curX = nx;
                    curY = ny;
                } else break;
            }

            ans = Math.max(ans, sec);
        }

        for (int i = 0; i < N; i++) {
            int curX = N - 1;
            int curY = i;

            int direc = 2;
            if (board[curY][curX] != 0) {
                direc = turnDirec(direc, board[curY][curX]);
            }

            int sec = 1;
            while (true) {
                sec++;

                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                    curX = nx;
                    curY = ny;
                } else if (isRange(nx, ny, N) && board[ny][nx] != 0) {
                    direc = turnDirec(direc, board[ny][nx]);

                    curX = nx;
                    curY = ny;
                } else break;
            }

            ans = Math.max(ans, sec);
        }

        for (int i = 0; i < N; i++) {
            int curX = i;
            int curY = N - 1;

            int direc = 0;
            if (board[curY][curX] != 0) {
                direc = turnDirec(direc, board[curY][curX]);
            }

            int sec = 1;
            while (true) {
                sec++;

                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                    curX = nx;
                    curY = ny;
                } else if (isRange(nx, ny, N) && board[ny][nx] != 0) {
                    direc = turnDirec(direc, board[ny][nx]);

                    curX = nx;
                    curY = ny;
                } else break;
            }

            ans = Math.max(ans, sec);
        }

        for (int i = 0; i < N; i++) {
            int curX = 0;
            int curY = i;

            int direc = 3;
            if (board[curY][curX] != 0) {
                direc = turnDirec(direc, board[curY][curX]);
            }

            int sec = 1;
            while (true) {
                sec++;

                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny, N) && board[ny][nx] == 0) {
                    curX = nx;
                    curY = ny;
                } else if (isRange(nx, ny, N) && board[ny][nx] != 0) {
                    direc = turnDirec(direc, board[ny][nx]);

                    curX = nx;
                    curY = ny;
                } else break;
            }

            ans = Math.max(ans, sec);
        }

        System.out.println(ans);
    }

    public static int turnDirec(int direc, int wall) {
        if (direc == 0) { // 상
            if (wall == 1) return 3;
            else return 2;
        } else if (direc == 1) {
            if (wall == 1) return 2;
            else return 3;
        } else if (direc == 2) {
            if (wall == 1) return 1;
            else return 0;
        } else {
            if (wall == 1) return 0;
            else return 1;
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}