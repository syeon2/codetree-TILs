import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] list = br.readLine().split(" ");

            for (int k = 0; k < N; k++) {
                board[i][k] = Integer.parseInt(list[k]);
            }
        }

        int cnt = 0;
        for (int y = 0; y < N; y++) {

            for (int x = 0; x < N; x++) {
                
                int temp = 0;
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (isRange(nx, ny, N) && board[ny][nx] == 1) temp++;
                }

                if (temp >= 3) cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y, int N) {
        if (x < 0 || x >= N || y < 0 || y >= N) return false;

        return true;
    }
}