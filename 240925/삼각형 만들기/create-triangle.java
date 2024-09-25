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
            for (int k = i + 1; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    int x1 = xList[i];
                    int x2 = xList[k];
                    int x3 = xList[j];

                    int y1 = yList[i];
                    int y2 = yList[k];
                    int y3 = yList[j];

                    int width = 0;
                    int height = 0;

                    if (x1 == x2) height = Math.abs(y1 - y2);
                    else if (x1 == x3) height = Math.abs(y1 - y3);
                    else if (x2 == x3) height = Math.abs(y2 - y3);

                    if (y1 == y2) width = Math.abs(x1 - x2);
                    else if (y1 == y3) width = Math.abs(x1 - x3);
                    else if (y2 == y3) width = Math.abs(x2 - x3);

                    ans = Math.max(ans, width * height);
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}