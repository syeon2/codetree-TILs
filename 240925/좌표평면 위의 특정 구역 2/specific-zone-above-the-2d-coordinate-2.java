import java.io.*;

// Idea : for문을 돌면서 점 하나를 뺀 나머지 점들의 x max, x min, y max, y min 값을 구하고 최소 직사각형 넓이를 갱신
// Math.min(ans, (x max - x min) * (y max - y min))

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

        for (int i = 0; i < N; i++) {

            int xMax = Integer.MIN_VALUE;
            int xMin = Integer.MAX_VALUE;

            int yMax = Integer.MIN_VALUE;
            int yMin = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x = xList[k];
                int y = yList[k];

                xMax = Math.max(xMax, x);
                xMin = Math.min(xMin, x);

                yMax = Math.max(yMax, y);
                yMin = Math.min(yMin, y);
            }

            ans = Math.min(ans, (xMax - xMin) * (yMax - yMin));
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();

    }
}