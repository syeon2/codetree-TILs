import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[19][19];
        for (int r = 0; r < 19; r++) {
            String[] strs = br.readLine().split(" ");

            for (int c = 0; c < 19; c++) {
                board[r][c] = Integer.parseInt(strs[c]);
            }
        }

        int ans = 0;
        int ansR = 0;
        int ansC = 0;

        for (int r = 0; r < 19; r++) {

            for (int c = 0; c <= 14; c++) {
                int target = board[r][c];

                if (target == 0) continue;

                boolean isWin = true;
                for (int i = c; i < c + 5; i++) {
                    if (target != board[r][i]) isWin = false;
                }

                if (isWin) {
                    ans = target;
                    ansR = r + 1;
                    ansC = c + 3;

                    break;
                }

                if (r >= 15) break;

                isWin = true;
                for (int i = 0; i < 5; i++) {
                    if (target != board[r + i][c + i]) isWin = false;
                }

                if (isWin) {
                    ans = target;
                    ansR = r + 3;
                    ansC = c + 3;

                    break;
                }

                isWin = true;
                for (int i = 0; i < 5; i++) {
                    if (target != board[r + i][c]) isWin = false;
                }

                if (isWin) {
                    ans = target;
                    ansR = r + 3;
                    ansC = c + 1;

                    break;
                }
            }

            if (ans != 0) break;
        }

        bw.write(String.valueOf(ans));
        bw.newLine();
        bw.write(ansR + " " + ansC);
        bw.flush();
        bw.close();
    }
}