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

        int[][] board = new int[n][n];
        for (int i = 1; i <= m; i++) {
            list = br.readLine().split(" ");

            int r = Integer.parseInt(list[0]) - 1;
            int c = Integer.parseInt(list[1]) - 1;

            board[r][c] = i;
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