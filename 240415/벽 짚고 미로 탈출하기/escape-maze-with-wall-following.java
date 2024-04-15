import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int N;
    public static int R;
    public static int C;

    public static char[][] board;
    public static int[][] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt();
        C = sc.nextInt();

        board = new char[N][N];
        memo = new int[N][N];

        for (int r = 0; r < N; r++) {
            char[] list = sc.next().toCharArray();

            for (int c = 0; c < N; c++) {
                board[r][c] = list[c];
            }
        }

        int ans = 0;

        int curX = C - 1;
        int curY = R - 1;

        int curDirec = 0;

        while (true) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny) && memo[ny][nx] == 5) {
                ans = -1;
                break;
            }

            if (isRange(nx, ny) && board[ny][nx] == '#') {
                memo[curY][curX]++;
                curDirec = turnLeft(curDirec);
            } else if (isRange(nx, ny) && board[ny][nx] == '.') {
                ans++;
                memo[ny][nx]++;
                curX = nx;
                curY = ny;

                int rightDirec = turnRight(curDirec);

                int rightX = curX + dx[rightDirec];
                int rightY = curY + dy[rightDirec];

                if (isRange(rightX, rightY) && board[rightY][rightX] == '.') curDirec = rightDirec;
            } else if (!isRange(nx, ny)) {
                ans++;
                break;
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int turnRight(int direc) {
        return (direc + 4 - 1) % 4;
    }

    public static int turnLeft(int direc) {
        return (direc + 1) % 4;
    }
}