import java.util.*;

public class Main {

    // U, R, D, L
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        char[] cmd = sc.next().toCharArray();

        int[][] board = new int[N + 1][N + 1];
        
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int curX = (N / 2) + 1;
        int curY = (N / 2) + 1;

        int curDirec = 0;

        int ans = board[curY][curX];

        for (int i = 0; i < T; i++) {
            if (cmd[i] == 'L') {
                curDirec = turnLeft(curDirec);
            } else if (cmd[i] == 'R') {
                curDirec = turnRight(curDirec);
            } else {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];

                if (isRange(nx, ny, N)) {
                    ans += board[ny][nx];
                    curX = nx;
                    curY = ny;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

        return false;
    }

    public static int turnLeft(int direc) {
        return (4 + (direc - 1)) % 4;
    }

    public static int turnRight(int direc) {
        return (direc + 1) % 4;
    }
}