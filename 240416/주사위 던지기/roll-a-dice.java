import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int N;
    public static int M;

    public static int R;
    public static int C;

    public static int[] upAndDown = {1, 6};
    public static int[] leftAndRight = {4, 3};
    public static int[] frontAndBack = {2, 5};

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        board = new int[N][N];
        board[R][C] = upAndDown[1];

        for (int m = 0; m < M; m++) {
            int direc = getDirec(sc.next().charAt(0));

            int nx = C + dx[direc];
            int ny = R + dy[direc];

            if (isRange(nx, ny)) {
                if (direc == 0) {
                    int up = upAndDown[0];
                    int down = upAndDown[1];
                    int left = leftAndRight[0];
                    int right = leftAndRight[1];

                    leftAndRight[0] = down;
                    leftAndRight[1] = up;
                    upAndDown[0] = left;
                    upAndDown[1] = right;
                } else if (direc == 1) {
                    int up = upAndDown[0];
                    int down = upAndDown[1];
                    int front = frontAndBack[0];
                    int back = frontAndBack[1];

                    frontAndBack[0] = up;
                    frontAndBack[1] = down;
                    upAndDown[0] = back;
                    upAndDown[1] = front;
                } else if (direc == 2) {
                    int up = upAndDown[0];
                    int down = upAndDown[1];
                    int left = leftAndRight[0];
                    int right = leftAndRight[1];

                    leftAndRight[0] = up;
                    leftAndRight[1] = down;
                    upAndDown[0] = right;
                    upAndDown[1] = left;
                } else {
                    int up = upAndDown[0];
                    int down = upAndDown[1];
                    int front = frontAndBack[0];
                    int back = frontAndBack[1];

                    frontAndBack[0] = down;
                    frontAndBack[1] = up;
                    upAndDown[0] = front;
                    upAndDown[1] = back;
                }

                board[ny][nx] = upAndDown[1];

                C = nx;
                R = ny;
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

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'R') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }
}