import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        int[] list = new int[N];
        for (int n = 0; n < N; n++) {
            list[n] = Integer.parseInt(br.readLine());
        }

        int ans = -1;

        for (int i = 0; i < N; i++) {
            int bomb = list[i];

            for (int k = Math.max(0, i - K); k <= Math.min(N - 1, i + K); k++) {
                if (i == k) continue;

                if (bomb == list[k]) ans = Math.max(ans, bomb);
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}