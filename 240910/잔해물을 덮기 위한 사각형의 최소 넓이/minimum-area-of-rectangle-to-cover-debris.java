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

        int width = 0;
        int height = 0;

        for (int y = 0; y < 2001; y++) {
            int start = -1;
            int end = 0;

            for (int x = 0; x < 2001; x++) {
                if (board[y][x] > 0 && start == -1) start = x;
                else if (board[y][x] > 0 && start >= 0) end = x;
            }

            if (start == -1) continue;
            width = Math.max(width, end - start + 1);
        }

        for (int x = 0; x < 2001; x++) {
            int start = -1;
            int end = 0;

            for (int y = 0; y < 2001; y++) {
                if (board[y][x] > 0 && start == -1) start = y;
                else if (board[y][x] > 0 && start >= 0) end = y;
            }

            if (start == -1) continue;
            height = Math.max(height, end - start + 1);
        }

        bw.write(String.valueOf(width * height));
        bw.flush();
        bw.close();
        
    }
}