import java.util.*;

public class Main {

    public static int N;
    public static char[][] board;
    public static int[][] memo;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;

        board = new char[N][N];
        memo = new int[N][N];

        for (int i = 0; i < N; i++) {
            char[] list = sc.next().toCharArray();

            for (int k = 0; k < N; k++) {
                board[i][k] = list[k];
            }
        }

        boolean trapped = false;
        int ans = 0;

        int curX = C;
        int curY = R;

        int curDirec = 0;

        while (true) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny) && memo[ny][nx] == 5) {
                trapped = true;
                break;
            }

            if (isRange(nx, ny) && board[ny][nx] == '#') {
                memo[ny][nx]++;
                curDirec = turnDirec(curDirec);
            } else if (isRange(nx, ny) && board[ny][nx] == '.') {
                int rightDirec = turnDirecRight(curDirec);

                if (isRange(nx + dx[rightDirec], ny + dy[rightDirec]) && board[nx + dx[rightDirec]][ny + dy[rightDirec]] == '.') curDirec = turnDirecRight(curDirec);

                memo[ny][nx]++;

                curX = nx;
                curY = ny;
                ans++;
            } else if (!isRange(nx, ny)) {
                ans++;
                break;
            }
        }

        if (trapped) System.out.print(-1);
        else System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;
        
        return false;
    }

    public static int turnDirecRight(int direc) {
        return (direc + 4 - 1) % 4;
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}