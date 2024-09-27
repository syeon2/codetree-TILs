import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        strs = br.readLine().split(" ");
        int[] list = new int[N];
        
        for (int n = 0; n < N; n++) {
            list[n] = Integer.parseInt(strs[n]);
        }

        int ans = Math.max(list[0], list[N - 1]);

        int idx = 0;
        while (idx < N - 1) {
            int start = idx + 1;
            int end = idx + K;

            int nextIdx = 0;
            int num = 101;
            for (int i = start; i <= Math.min(end, N - 1); i++) {
                if (list[i] < num) {
                    nextIdx = i;
                    num = list[i];
                }
            }

            ans = Math.max(ans, num);
            idx = nextIdx;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}