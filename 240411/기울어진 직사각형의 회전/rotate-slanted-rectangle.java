import java.util.*;

public class Main {

    public static int N;

    public static int[][] board;

    public static int R;
    public static int C;

    public static int[] dist = new int[4];

    public static int DIREC;

    public static int[] dx = {1, -1, -1, 1};
    public static int[] dy = {-1, -1, 1, 1};

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

        R = sc.nextInt() - 1;
        C = sc.nextInt() - 1;

        for (int i = 0; i < 4; i++) {
            dist[i] = sc.nextInt();
        }

        DIREC = sc.nextInt();

        if (DIREC == 1) turnRight();
        else turnLeft();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void turnRight() {
        int curX = C;
        int curY = R;

        int tempValue = board[curY][curX];

        for (int i = 0; i < 4; i++) {
            int cnt = dist[i];

            while (cnt-- > 0) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                board[curY][curX] = board[ny][nx];

                curX = nx;
                curY = ny;
            }
        }

        board[curY - 1][curX - 1] = tempValue;
    }

    public static void turnLeft() {
        int curX = C;
        int curY = R;
        
        int tempValue = board[curY][curX];

        for (int i = 3; i >= 0; i--) {
            int cnt = dist[i];

            while (cnt-- > 0) {
                int nx = curX + (dx[i] * -1);
                int ny = curY + (dy[i] * -1);

                board[curY][curX] = board[ny][nx];

                curX = nx;
                curY = ny;
            }
        }

        board[curY - 1][curX + 1] = tempValue;
    }
}