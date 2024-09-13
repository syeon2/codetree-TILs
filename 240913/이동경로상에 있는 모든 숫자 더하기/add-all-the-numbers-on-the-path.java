import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int T = Integer.parseInt(list[1]);

        char[] cmds = br.readLine().toCharArray();
        int[][] board = new int[N][N];
        for (int r = 0; r < N; r++) {
            list = br.readLine().split(" ");

            for (int c = 0; c < N; c++) {
                board[r][c] = Integer.parseInt(list[c]);    
            }
        }

        int curX = N / 2;
        int curY = N / 2;
        int curDir = 0;

        int ans = board[curY][curX];
        for (int i = 0; i < cmds.length; i++) {
            if (cmds[i] == 'F') {
                int nx = curX + dx[curDir];
                int ny = curY + dy[curDir];

                if (isRange(nx, ny, N)) {
                    ans += board[ny][nx];
                    curX = nx;
                    curY = ny;
                }
            } else curDir = turnDir(curDir, cmds[i]);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int turnDir(int dir, char cmd) {
        if (cmd == 'R') return (dir + 1) % 4;

        return (4 + (dir - 1)) % 4;
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }
}