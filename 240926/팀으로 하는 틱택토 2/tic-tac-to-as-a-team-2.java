import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            char[] list = br.readLine().toCharArray();

            for (int k = 0; k < 3; k++) {
                board[i][k] = list[k] - '0';
            }
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int k = i + 1; k <= 9; k++) {

                boolean can = false;

                for (int j = 0; j < 3; j++) {
                    int fCnt = 0;
                    int sCnt = 0;

                    for (int l = 0; l < 3; l++) {
                        if (board[j][l] == i) fCnt++;
                        else if (board[j][l] == k) sCnt++;
                    }

                    if (fCnt != 0 && sCnt != 0 && fCnt + sCnt == 3) can = true;
                }

                for (int j = 0; j < 3; j++) {
                    int fCnt = 0;
                    int sCnt = 0;

                    for (int l = 0; l < 3; l++) {
                        if (board[l][j] == i) fCnt++;
                        else if (board[l][j] == k) sCnt++;
                    }

                    if (fCnt != 0 && sCnt != 0 && fCnt + sCnt == 3) can = true;
                }

                int fCnt = 0;
                int sCnt = 0;

                for (int j = 0; j < 3; j++) {
                    if (board[j][j] == i) fCnt++;
                    else if (board[j][j] == k) sCnt++;
                }

                if (fCnt != 0 && sCnt != 0 && fCnt + sCnt == 3) can = true;

                fCnt = 0;
                sCnt = 0;

                for (int j = 2; j >= 0; j--) {
                    if (board[2 - j][j] == i) fCnt++;
                    else if (board[2 - j][j] == k) sCnt++;
                }

                if (fCnt != 0 && sCnt != 0 && fCnt + sCnt == 3) can = true;

                if (can) cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}