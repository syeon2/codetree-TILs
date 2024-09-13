import java.io.*;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];

        int cnt = N * N;

        int curX = N - 1;
        int curY = N - 1;

        int curDir = 0;

        while (cnt > 0) {
            board[curY][curX] = cnt;

            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (!isRange(nx, ny, N) || board[ny][nx] != 0) {
                curDir = turnDir(curDir);
            }

            curX += dx[curDir];
            curY += dy[curDir];

            cnt--;
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append(board[r][c]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    public static int turnDir(int dir) {
        return (dir + 1) % 4;
    }
}