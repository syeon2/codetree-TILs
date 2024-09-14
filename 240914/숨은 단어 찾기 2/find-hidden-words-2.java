import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);

        char[][] board = new char[N][M];
        for (int r = 0; r < N; r++) {
            char[] list = br.readLine().toCharArray();

            for (int c = 0; c < M; c++) {
                board[r][c] = list[c];
            }
        }

        int ans = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {

                for (int i = 0; i < 8; i++) {
                    boolean can = true;

                    for (int k = 0; k < 3; k++) {
                        int nx = c + (dx[i] * k);
                        int ny = r + (dy[i] * k);

                        if (!isRange(nx, ny, M, N)) {
                            can = false;
                            break;
                        }

                        if (!((k == 0 && board[ny][nx] == 'L') || ((k == 1 || k == 2) && board[ny][nx] == 'E'))) {
                            can = false;
                        }
                    }

                    if (can) ans++;
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y, int X, int Y) {
        return (x >= 0 && x < X && y >= 0 && y < Y);
    }
}