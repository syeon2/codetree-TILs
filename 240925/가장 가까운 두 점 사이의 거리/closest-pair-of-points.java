import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] xList = new int[N];
        int[] yList = new int[N];

        for (int i = 0; i < N; i++) {

            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);

            xList[i] = x;
            yList[i] = y;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            
            for (int k = i + 1; k < N; k++) {
                int x1 = xList[i];
                int x2 = xList[k];

                int y1 = yList[i];
                int y2 = yList[k];

                ans = Math.min(ans, ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}