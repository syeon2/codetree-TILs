import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        int[][] board = new int[n][m];
        int cnt = 1;

        for (int i = 0; i < m; i++) {
            int w = i;

            for (int k = 0; k < n; k++) {
                if (w < 0) break;

                board[k][w--] = cnt++;
            }
        }

        for (int i = 1; i < n; i++) {
            int h = i;

            for (int k = n - 1; k >= 0; k--) {
                if (h == n) break;

                board[h++][k] = cnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}