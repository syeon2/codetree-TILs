import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[] list = new char[101];
        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int pos = Integer.parseInt(strs[0]);
            char c = strs[1].charAt(0);

            list[pos] = c;
        }

        int max = 0;
        for (int i = 0; i <= 100; i++) {

            for (int k = 1; k <= 100 - i; k++) {
                int sIdx = k;
                int eIdx = k + i;

                if (sIdx < 1 || eIdx > 100 || list[sIdx] == 0 || list[eIdx] == 0) continue;

                int gCnt = 0;
                int hCnt = 0;

                for (int j = sIdx; j <= eIdx; j++) {
                    if (list[j] == 'G') gCnt++;
                    else if (list[j] == 'H') hCnt++;    
                }

                if ((gCnt == 0 && hCnt != 0) || (gCnt != 0 && hCnt == 0) || (gCnt != 0 && gCnt == hCnt)) {
                    max = Math.max(max, (eIdx - sIdx));
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}