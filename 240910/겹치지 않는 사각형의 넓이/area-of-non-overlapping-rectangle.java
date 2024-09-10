import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[2001][2001];
        for (int i = 0; i < 2; i++) {
            String[] strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]) + 1000;
            int y1 = Integer.parseInt(strs[1]) + 1000;
            int x2 = Integer.parseInt(strs[2]) + 1000;
            int y2 = Integer.parseInt(strs[3]) + 1000;

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    board[y][x]++;
                }
            }
        }

        String[] strs = br.readLine().split(" ");

        int x1 = Integer.parseInt(strs[0]) + 1000;
        int y1 = Integer.parseInt(strs[1]) + 1000;
        int x2 = Integer.parseInt(strs[2]) + 1000;
        int y2 = Integer.parseInt(strs[3]) + 1000;

        for (int y = y1; y < y2; y++) {
            for (int x = x1; x < x2; x++) {
                board[y][x] = 0;
            }
        }

        int ans = 0;
        for (int y = 0; y < 2001; y++) {
            for (int x = 0; x < 2001; x++) {
                if (board[y][x] >= 1) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}