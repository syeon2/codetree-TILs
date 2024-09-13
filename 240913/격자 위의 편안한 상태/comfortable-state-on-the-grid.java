import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);

        int[][] board = new int[N][N];

        while (M-- > 0) {
            list = br.readLine().split(" ");

            int r = Integer.parseInt(list[0]) - 1;
            int c = Integer.parseInt(list[1]) - 1;

            board[r][c] = 1;

            int temp = 0;
            for (int i = 0; i < 4; i++) {
                int nx = c + dx[i];
                int ny = r + dy[i];

                if (isRange(nx, ny, N) && board[ny][nx] == 1) {
                    temp++;
                }
            }

            if (temp == 3) sb.append(1);
            else sb.append(0);

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }
}