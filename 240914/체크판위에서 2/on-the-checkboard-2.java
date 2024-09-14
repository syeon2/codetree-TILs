import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int R = Integer.parseInt(str[0]);
        int C = Integer.parseInt(str[1]);

        char[][] board = new char[R][C];
        for (int r = 0; r < R; r++) {
            str = br.readLine().split(" ");

            for (int c = 0; c < C; c++) {
                board[r][c] = str[c].charAt(0);
            }
        }

        int ans = 0;
        char start = board[0][0]; // 1번째는 start != c // 2번째는 start == c

        for (int r1 = 1; r1 < R - 1; r1++) {
            for (int c1 = 1; c1 < C - 1; c1++) {

                for (int r2 = r1 + 1; r2 < R - 1; r2++) {
                    for (int c2 = c1 + 1; c2 < C - 1; c2++) {
                        if (board[r1][c1] != start && board[r2][c2] == start && board[R - 1][C - 1] != start) ans++;
                    }
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}