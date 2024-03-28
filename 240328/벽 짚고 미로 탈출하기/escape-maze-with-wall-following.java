import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        char[][] board = new char[N][N];
        int[][] memo = new int[N][N];

        for (int i = 0; i < N; i++) {
            char[] list = sc.next().toCharArray();

            for (int k = 0; k < N; k++) {
                board[i][k] = list[k];
                memo[i][k] = 4;
            }
        }

        int curX = c;
        int curY = r;

        int curDirec = 0;
        memo[r][c] = 0;

        int ans = 0;

        while (true) {
            int rightDirec = (curDirec + 1) % 4;

            int nx1 = curX + dx[rightDirec];
            int ny1 = curY + dy[rightDirec];

            int nx2 = curX + dx[curDirec];
            int ny2 = curY + dy[curDirec];

            if (isRange(nx1, ny1, N) && board[ny1][nx1] != '#') {
                ans++;
                curX = nx1;
                curY = ny1;

                curDirec = rightDirec;

                memo[curY][curX] = curDirec;
            } else if (isRange(nx2, ny2, N) && board[ny2][nx2] != '#') {
                ans++;

                curX = nx2;
                curY = ny2;
            } else if (!isRange(nx2, ny2, N) || !isRange(nx1, ny1, N)) {
                ans++;
                break;
            } else curDirec = (4 + (curDirec - 1)) % 4;

            if (memo[curY][curX] == curDirec) {
                ans = -1;
                break;
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}