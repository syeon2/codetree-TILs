import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);

        strs = br.readLine().split(" ");
        int[] nList = new int[N];
        for (int n = 0; n < N; n++) {
            nList[n] = Integer.parseInt(strs[n]);
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int cnt = M;
            int idx = i;
            int sum = 0;

            while (cnt-- > 0) {
                sum += nList[idx];
                idx = nList[idx] - 1;
            }

            ans = Math.max(ans, sum);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}