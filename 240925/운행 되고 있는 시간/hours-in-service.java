import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] xList = new int[N];
        int[] yList = new int[N];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);

            xList[n] = x;
            yList[n] = y;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int[] time = new int[1001];

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int start = xList[k];
                int end = yList[k];

                for (int j = start; j < end; j++) {
                    time[j]++;
                }
            }

            int temp = 0;
            for (int k = 1; k <= 1000; k++) {
                if (time[k] >= 1) temp++;
            }

            ans = Math.max(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}