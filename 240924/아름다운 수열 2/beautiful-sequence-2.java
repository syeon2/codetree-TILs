import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);

        int[] A = new int[N];
        strs = br.readLine().split(" ");
        for (int n = 0; n < N; n++) {
            A[n] = Integer.parseInt(strs[n]);
        }

        int[] B = new int[101];
        strs = br.readLine().split(" ");
        for (int m = 0; m < M; m++) {
            int idx = Integer.parseInt(strs[m]);

            B[idx]++;
        }

        int cnt = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] copy = new int[101];
            for (int k = 0; k < 101; k++) {
                copy[k] = B[k];
            }

            for (int k = i; k < i + M; k++) {
                int idx = A[k];

                copy[idx]--;

                if (copy[idx] < 0) break;
            }

            boolean isBeautiful = true;
            for (int k = 0; k < 101; k++) {
                if (copy[k] != 0) isBeautiful = false;
            }

            if (isBeautiful) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}