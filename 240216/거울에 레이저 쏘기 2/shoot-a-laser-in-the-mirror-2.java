import java.util.Scanner;

public class Main {

    // R, D, L, U
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[][] list = new char[N][N];

        for (int n = 0; n < N; n++) {
            char[] mirrors = sc.next().toCharArray();

            for (int m = 0; m < mirrors.length; m++) {
                list[n][m] = mirrors[m];
            }
        }

        int start = sc.nextInt();

        // 시작점 세팅
        int cnt = 1;
        int curDir = 0;

        int curX = 0;
        int curY = 0;

        while (--start > 0) {
            int nx = curX + dx[curDir];
            int ny = curY = dy[curDir];

            if (isRange(N, nx, ny)) {
                curX = nx;
                curY = ny;
            } else {
                curDir = curDir + 1;
            }
        }

        if (curDir == 0) curDir = 1;
        else if (curDir == 1) curDir = 2;
        else if (curDir == 2) curDir = 3;
        else curDir = 0;

        curDir = getTurnDir(curDir, list[curY][curX]);

        // 현재 상하좌우 중 시작점에서 방으로 들어갔을 경우 변경될 수 있는 방향
        while (true) {
            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (!isRange(N, nx, ny)) break;

            curDir = getTurnDir(curDir, list[curY][curX]);
            curX = nx;
            curY = ny;
            cnt++;
        }

        System.out.print(cnt);
    }

    public static int getTurnDir(int dir, char mirror) {
        if (dir == 1 && mirror == '\\') return 0;
        else if (dir == 1 && mirror == '/') return 2;
        else if (dir == 2 && mirror == '\\') return 1;
        else if (dir == 2 && mirror == '/') return 3;
        else if (dir == 3 && mirror == '\\') return 2;
        else if (dir == 3 && mirror == '/') return 0;
        else if (dir == 0 && mirror == '\\') return 1;
        else return 3;
    }

    public static boolean isRange(int N, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}