import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        char[] list = sc.next().toCharArray();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int curX = N / 2;
        int curY = N / 2;

        int direc = 0;

        int ans = board[curY][curX];

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 'F') {
                int nx = curX + dx[direc];
                int ny = curY + dy[direc];

                if (isRange(nx, ny, N)) {
                    ans += board[ny][nx];

                    curX = nx;
                    curY = ny;
                }
            } else direc = turnDirec(list[i], direc);
        }

        System.out.print(ans);
    }

    public static int turnDirec(char cmd, int direc) {
        if (cmd == 'R') return (direc + 1) % 4;
        else return (4 + (direc - 1)) % 4;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}