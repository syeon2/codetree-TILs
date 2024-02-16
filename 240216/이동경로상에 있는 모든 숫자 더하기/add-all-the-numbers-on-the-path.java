import java.util.Scanner;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        char[] cmd = sc.next().toCharArray();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int curDir = 0;
        int curX = N / 2;
        int curY = N / 2;

        int ans = board[curY][curX];

        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i] == 'L') {
                curDir = (4 + (curDir - 1)) % 4;
            } else if (cmd[i] == 'R') {
                curDir = (curDir + 1) % 4;
            } else {
                int nx = curX + dx[curDir];
                int ny = curY + dy[curDir];

                if (isRange(N, nx, ny)) {
                    ans += board[ny][nx];
                    curX = nx;
                    curY = ny;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int N, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}