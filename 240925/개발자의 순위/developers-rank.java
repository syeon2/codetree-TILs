import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int K = Integer.parseInt(strs[0]);
        int N = Integer.parseInt(strs[1]);

        int[][] list = new int[K][N];

        for (int k = 0; k < K; k++) {
            strs = br.readLine().split(" ");

            for (int n = 0; n < N; n++) {
                list[k][n] = Integer.parseInt(strs[n]);
            }
        }

        int ans = 0;

        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {
                if (i == k) continue;

                boolean isFirst = true;

                for (int x = 0; x < K; x++) {
                    int fIdx = 0;
                    int sIdx = 0;

                    for (int y = 0; y < N; y++) {
                        if (list[x][y] == i) fIdx = y;
                        else if (list[x][y] == k) sIdx = y;
                    }

                    if (fIdx > sIdx) isFirst = false;
                }

                if (isFirst) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}