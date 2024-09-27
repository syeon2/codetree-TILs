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

        int ans = 0;
        for (int i = 0; i < N; i++) {

            int temp = 0;
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                if (Math.abs(list[i] - list[k]) <= K) temp++;
            }

            ans = Math.max(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}