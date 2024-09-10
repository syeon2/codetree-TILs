import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[2001][2001];

        for (int i = 1; i <= 2; i++) {
            String[] strs = strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]) + 1000;
            int y1 = Integer.parseInt(strs[1]) + 1000;
            int x2 = Integer.parseInt(strs[2]) + 1000;
            int y2 = Integer.parseInt(strs[3]) + 1000;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (i == 1) board[y][x] = 1;
                    else board[y][x] = 0;
                }
            }
        }

        boolean isChanged = false;
        int ansX1 = Integer.MAX_VALUE;
        int ansX2 = Integer.MIN_VALUE;
        int ansY1 = Integer.MAX_VALUE;
        int ansY2 = Integer.MIN_VALUE;

        for (int y = 0; y < 2001; y++) {
            for (int x = 0; x < 2001; x++) {
                if (board[y][x] == 1) {
                    isChanged = true;

                    ansX1 = Math.min(ansX1, x);
                    ansX2 = Math.max(ansX2, x);
                    ansY1 = Math.min(ansY1, y);
                    ansY2 = Math.max(ansY2, y);
                }
            }
        }

        if (isChanged) {
            bw.write(String.valueOf((ansX2 - ansX1 + 1) * (ansY2 - ansY1 + 1)));
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        
    }
}