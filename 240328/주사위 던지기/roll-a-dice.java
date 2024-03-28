import java.util.*;

public class Main {

    public static int[] upDown = {1, 6};
    public static int[] leftRight = {4, 3};
    public static int[] frontBack = {2, 5};

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;

        int[][] board = new int[N][N];

        board[R][C] = 6;

        int curX = C;
        int curY = R;

        while (M-- > 0) {
            int curDirec = getDirec(sc.next().charAt(0));

            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny, N)) {
                if (curDirec == 0) { // 상
                    int up = upDown[0];
                    int down = upDown[1];

                    board[ny][nx] = frontBack[1];

                    upDown[0] = frontBack[0];
                    upDown[1] = frontBack[1];
                    frontBack[0] = down;
                    frontBack[1] = up;

                    curX = nx;
                    curY = ny;
                } else if (curDirec == 1) { // 하
                    int up = upDown[0];
                    int down = upDown[1];

                    board[ny][nx] = frontBack[0];
                    
                    upDown[0] = frontBack[1];
                    upDown[1] = frontBack[0];
                    frontBack[0] = up;
                    frontBack[1] = down;

                    curX = nx;
                    curY = ny;
                } else if (curDirec == 2) { // 좌
                    int up = upDown[0];
                    int down = upDown[1];

                    board[ny][nx] = leftRight[0];

                    upDown[0] = leftRight[1];
                    upDown[1] = leftRight[0];
                    leftRight[0] = up;
                    leftRight[1] = down;

                    curX = nx;
                    curY = ny;
                } else {
                    int up = upDown[0];
                    int down = upDown[1];

                    board[ny][nx] = leftRight[1];

                    upDown[0] = leftRight[0];
                    upDown[1] = leftRight[1];
                    leftRight[0] = down;
                    leftRight[1] = up;

                    curX = nx;
                    curY = ny;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                ans += board[i][k];
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }
}