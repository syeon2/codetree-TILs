import java.util.Scanner;

public class Main {

    // R, D, L, U
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int k = 0; k < N; k++) {
                board[i][k] = str.charAt(k);
            }
        }

        int K = sc.nextInt();

        int curDir = 0;
        int curX = 0;
        int curY = 0;

        // 처음 시작할 위치 선정
        while (--K > 0) {
            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (isRange(N, nx, ny)) {
                curX = nx;
                curY = ny;
            } else {
                curDir = (curDir + 1) % 4;
            }
        }

        if (curDir == 0) curDir = 1;
        else if (curDir == 1) curDir = 2;
        else if (curDir == 2) curDir = 3;
        else curDir = 0;

        int cnt = 1;

        while (true) {
            curDir = getTurnDir(curDir, board[curY][curX]);

            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (!isRange(N, nx, ny)) break;

            curX = nx;
            curY = ny;
            cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean isRange(int N, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getTurnDir(int curDir, char mirror) {
        if (curDir == 1 && mirror == '\\') return 0;
        else if (curDir == 1 && mirror == '/') return 2;
        else if (curDir == 2 && mirror == '\\') return 3;
        else if (curDir == 2 && mirror == '/') return 1;
        else if (curDir == 3 && mirror == '\\') return 2;
        else if (curDir == 3 && mirror == '/') return 0;
        else if (curDir == 0 && mirror == '\\') return 1;
        else return 3;

    }
}