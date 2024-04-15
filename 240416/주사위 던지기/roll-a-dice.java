import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int R;
    public static int C;

    public static int[][] board;

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        board = new int[N][N];


        int f = 2;
        int b = 5;
        int u = 1;
        int d = 6;
        int l = 4;
        int r = 5;

        int curX = C;
        int curY = R;
        board[curY][curX] = d;

        for (int m = 0; m < M; m++) {
            char c = sc.next().charAt(0);

            int direc = getDirec(c);

            int nx = curX + dx[direc];
            int ny = curY + dy[direc];

            if (isRange(nx, ny)) {
                curX = nx;
                curY = ny;

                if (direc == 0) {
                    int tempF = f;
                    int tempU = u;
                    int tempB = b;
                    int tempD = d;

                    u = tempF;
                    b = tempU;
                    d = tempB;
                    f = tempD;
                } else if (direc == 1) {
                    int tempB = b;
                    int tempU = u;
                    int tempF = f;
                    int tempD = d;

                    u = tempB;
                    f = tempU;
                    d = tempF;
                    b = tempD;
                } else if (direc == 2) {
                    int tempU = u;
                    int tempL = l;
                    int tempD = d;
                    int tempR = r;

                    l = tempU;
                    d = tempL;
                    r = tempD;
                    u = tempR;
                } else {
                    int tempU = u;
                    int tempR = r;
                    int tempD = d;
                    int tempL = l;

                    r = tempU;
                    d = tempR;
                    l = tempD;
                    u = tempL;
                }

                board[ny][nx] = d;
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

    public static int getDirec(char c) {
        if (c == 'L') return 2;
        else if (c == 'R') return 3;
        else if (c == 'U') return 0;
        else return 1;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}