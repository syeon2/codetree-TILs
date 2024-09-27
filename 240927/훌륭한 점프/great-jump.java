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

        int ans = list[0];

        int idx = 0;
        while (idx < N) {
            if (idx + 2 < N) {
                int f = list[idx + 1];
                int s = list[idx + 2];

                if (f < s) {
                    idx += 1;
                    ans = Math.max(ans, f);
                } else {
                    idx += 2;
                    ans = Math.max(ans, s);
                }
            } else if (idx + 1 < N) {
                int f = list[idx++ + 1];

                ans = Math.max(ans, f);
            } else break;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}