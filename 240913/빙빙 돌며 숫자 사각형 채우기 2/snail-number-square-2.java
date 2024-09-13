import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);

        int[][] board = new int[N][M];

        int curX = 0;
        int curY = 0;
        int curDir = 0;

        int cnt = 1;

        for (int i = 1; i <= N * M; i++) {
            board[curY][curX] = cnt++;

            int nx = curX + dx[curDir];
            int ny = curY + dy[curDir];

            if (!isRange(nx, ny, M, N) || board[ny][nx] != 0) {
                curDir = turnDir(curDir);
            }

            curX += dx[curDir];
            curY += dy[curDir];
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                sb.append(board[r][c]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int turnDir(int dir) {
        return (dir + 1) % 4;
    }

    public static boolean isRange(int x, int y, int X, int Y) {
        return (x >= 0 && x < X && y >= 0 && y < Y);
    }
}