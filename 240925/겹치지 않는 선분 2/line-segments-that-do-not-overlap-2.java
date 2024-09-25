import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] x1List = new int[N];
        int[] x2List = new int[N];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]);
            int x2 = Integer.parseInt(strs[1]);

            x1List[n] = x1;
            x2List[n] = x2;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {

            boolean isCross = false;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x1 = x1List[i];
                int x2 = x2List[i];

                int x3 = x1List[k];
                int x4 = x2List[k];

                if ((x1 >= x3 && x2 >= x4) || (x1 <= x3 && x2 <= x4)) continue;
                else isCross = true;
            }

            if (!isCross) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}