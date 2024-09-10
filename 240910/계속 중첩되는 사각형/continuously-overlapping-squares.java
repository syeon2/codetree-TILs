import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[201][201];

        for (int n = 1; n <= N; n++) {
            String[] strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]) + 100;
            int y1 = Integer.parseInt(strs[1]) + 100;
            int x2 = Integer.parseInt(strs[2]) + 100;
            int y2 = Integer.parseInt(strs[3]) + 100;

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    if (n % 2 == 1) board[y][x] = 1; // 빨
                    else board[y][x] = 2; // 파
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 201; i++) {
            for (int k = 0; k < 201; k++) {
                if (board[i][k] == 2) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}