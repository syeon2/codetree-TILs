import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];
        int cnt = 1;

        for (int i = n - 1; i >= 0; i--) {
            if ((n - i) % 2 == 1) {
                for (int k = n - 1; k >= 0; k--) {
                    board[k][i] = cnt++;
                }
            } else {
                for (int k = 0; k < n; k++) {
                    board[k][i] = cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}