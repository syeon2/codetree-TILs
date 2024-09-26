import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] list = new int[N];
        
        for (int n = 0; n < N; n++) {
            list[n] = Integer.parseInt(strs[n]);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int[] temp = new int[N];

            for (int k = 0; k < N; k++) {
                temp[k] = list[k];

                if (i == k) temp[k] *= 2;
            }

            for (int k = 0; k < N; k++) {
                int sum = 0;
                int prev = -1;

                for (int j = 0; j < N; j++) {
                    if (k == j) continue;

                    if (prev == -1) prev = temp[j];
                    else {
                        sum += Math.abs(prev - temp[j]);
                        prev = temp[j];
                    }
                }

                ans = Math.min(ans, sum);
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}