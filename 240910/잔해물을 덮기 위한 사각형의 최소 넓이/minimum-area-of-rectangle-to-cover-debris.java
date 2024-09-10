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

        for (int i = y1; i < y2; i++) {
            for (int k = x1; k < x2; k++) {
                board[i][k]++;
            }
        }

        strs = br.readLine().split(" ");

        x1 = Integer.parseInt(strs[0]) + 1000;
        y1 = Integer.parseInt(strs[1]) + 1000;
        x2 = Integer.parseInt(strs[2]) + 1000;
        y2 = Integer.parseInt(strs[3]) + 1000;

        for (int i = y1; i < y2; i++) {
            for (int k = x1; k < x2; k++) {
                board[i][k] = 0;
            }
        }

        int width = 0;
        int height = 0;

        for (int y = 0; y < 2001; y++) {
            int start = 0;
            int end = 0;

            for (int x = 0; x < 2001; x++) {
                if (board[y][x] > 0 && start == 0) start = x;
                else if (board[y][x] > 0 && start > 0) end = x;
            }

            if (width == 0 && height == 0) continue;
            width = Math.max(width, end - start + 1);
        }

        for (int x = 0; x < 2001; x++) {
            int start = 0;
            int end = 0;

            for (int y = 0; y < 2001; y++) {
                if (board[y][x] > 0 && start == 0) start = y;
                else if (board[y][x] > 0 && start > 0) end = y;
            }

            if (width == 0 && height == 0) continue;
            height = Math.max(height, end - start + 1);
        }

        bw.write(String.valueOf(width * height));
        bw.flush();
        bw.close();
    }
}