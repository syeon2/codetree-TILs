import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // n == y, m == x
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board = new int[n][m];

        int curX = 0;
        int curY = 0;
        
        int curDirec = 0;

        int curNum = 1;
        board[curY][curX] = curNum++;

        while (true) {
            if (curNum > n * m) break;

            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny, n, m) && board[ny][nx] == 0) {
                board[ny][nx] = curNum++;
                curX = nx;
                curY = ny;
            } else curDirec = turnDirec(curDirec);
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int N, int M) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }

    public static int turnDirec(int curDirec) {
        return (curDirec + 1) % 4;
    }
}