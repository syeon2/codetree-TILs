import java.util.*;

public class Main {

    // R, D, L, U
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];

        int curX = 0;
        int curY = 0;

        int curDirec = 0;

        char c = 'A';
        int cnt = 1;
        board[curY][curX] = c;
        c += 1;

        while (cnt < N * M) {
            int nx = curX + dx[curDirec];
            int ny = curY + dy[curDirec];

            if (isRange(nx, ny, N, M) && board[ny][nx] == 0) {
                board[ny][nx] = c;
                curX = nx;
                curY = ny;
                c += 1;
                cnt++;

                if (c > 'Z') c = 'A';
            } else curDirec = turnDirec(curDirec);
        }

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < M; k++) {
                System.out.printf("%s ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }

    public static boolean isRange(int x, int y, int N, int M) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}