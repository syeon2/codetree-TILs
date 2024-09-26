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

        int ans = Integer.MAX_VALUE;
        for (int i = 2; i <= 100; i += 2) {

            for (int k = 2; k <= 100; k += 2) {

                int first = 0;
                int second = 0;
                int third = 0;
                int fourth = 0;

                for (int n = 0; n < N; n++) {
                    int x1 = xList[n];
                    int y1 = yList[n];

                    if (x1 > i && y1 > k) first++;
                    else if (x1 < i && y1 > k) second++;
                    else if (x1 < i && y1 < k) third++;
                    else if (x1 > i && y1 < k) fourth++;
                }

                int max = Math.max(Math.max(first, second), Math.max(third, fourth));

                ans = Math.min(ans, max);
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}