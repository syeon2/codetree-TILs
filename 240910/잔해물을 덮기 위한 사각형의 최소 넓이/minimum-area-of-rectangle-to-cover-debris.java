import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[2001][2001];

        String[] strs = br.readLine().split(" ");

        int x1 = Integer.parseInt(strs[0]) + 1000;
        int y1 = Integer.parseInt(strs[1]) + 1000;
        int x2 = Integer.parseInt(strs[2]) + 1000;
        int y2 = Integer.parseInt(strs[3]) + 1000;

        for (int y = y1; y < y2; y++) {
            for (int x = x1; x < x2; x++) {
                board[y][x] = 1;
            }
        }

        strs = br.readLine().split(" ");

        x1 = Integer.parseInt(strs[0]) + 1000;
        y1 = Integer.parseInt(strs[1]) + 1000;
        x2 = Integer.parseInt(strs[2]) + 1000;
        y2 = Integer.parseInt(strs[3]) + 1000;

        for (int y = y1; y < y2; y++) {
            for (int x = x1; x < x2; x++) {
                board[y][x] = 0;
            }
        }

        int ansX1 = 10000;
        int ansX2 = -10000;
        int ansY1 = 10000;
        int ansY2 = -10000;

        for (int y = 0; y < 2001; y++) {

            for (int x = 0; x < 2001; x++) {
                if (board[y][x] > 0) {
                    ansX1 = Math.min(ansX1, x);
                    ansX2 = Math.max(ansX2, x);
                }
            }
        }

        for (int x = 0; x < 2001; x++) {

            for (int y = 0; y < 2001; y++) {
                if (board[y][x] > 0) {
                    ansY1 = Math.min(ansY1, y);
                    ansY2 = Math.max(ansY2, y);
                }
            }
        }

        bw.write(String.valueOf((ansX2 - ansX1 + 1) * (ansY2 - ansY1 + 1)));
        bw.flush();
        bw.close();
    }
}