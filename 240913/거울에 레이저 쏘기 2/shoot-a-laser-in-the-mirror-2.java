import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];
        for (int r = 0; r < N; r++) {

            char[] list = br.readLine().toCharArray();
            for (int c = 0; c < N; c++) {
                board[r][c] = list[c];
            }
        }

        int K = Integer.parseInt(br.readLine());
        int k = K;

        int curX = 0;
        int curY = 0;
        int curDir = 1;

        while (k-- > 1) {
            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (isRange(nx, ny, N)) {
                curX = nx;
                curY = ny;
            } else curDir = firstTurnDir(curDir);
        }

        int cnt = 0;
        curDir = firstGetDir(K, N);

        while (isRange(curX, curY, N)) {
            cnt++;

            curDir = turnDir(curDir, board[curY][curX]);

            curX += dx[curDir];
            curY += dy[curDir];
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    public static int firstGetDir(int n, int N) {
        if (n <= N) return 2;
        else if (n <= 2 * N) return 3;
        else if (n <= 3 * N) return 0;
        else return 1;
    }

    public static int firstTurnDir(int curDir) {
        return (curDir + 1) % 4;
    }

    public static int turnDir(int curDir, char mirror) {
         if (curDir == 0) { // Up
            if (mirror == '/') return 1;
            else return 3;
         } else if (curDir == 1) { // Right
            if (mirror == '/') return 0;
            else return 2;
         } else if (curDir == 2) { // Down
            if (mirror == '/') return 3;
            else return 1;
         } else { // Left
            if (mirror == '/') return 2;
            else return 0;
         }
    }
}