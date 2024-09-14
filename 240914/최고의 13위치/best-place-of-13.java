import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int r = 0; r < N; r++) {
            String[] str = br.readLine().split(" ");

            for (int c = 0; c < N; c++) {
                board[r][c] = Integer.parseInt(str[c]);
            }
        }

        int max = 0;
        for (int r = 0; r < N; r++) {

            for (int c = 0; c <= N - 3; c++) {
                int temp = 0;

                for (int i = c; i < c + 3; i++) {
                    if (board[r][i] == 1) temp++;
                }

                max = Math.max(max, temp);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}