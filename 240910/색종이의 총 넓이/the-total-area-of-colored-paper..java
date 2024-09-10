import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[201][201];

        for (int i = 0; i < N; i++) {
            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]) + 100;
            int y = Integer.parseInt(strs[1]) + 100;

            for (int k = x; k < x + 8; k++) {
                for (int j = y; j < y + 8; j++) {
                    board[j][k]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 201; i++) {
            for (int k = 0; k < 201; k++) {
                if (board[k][i] >= 1) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}