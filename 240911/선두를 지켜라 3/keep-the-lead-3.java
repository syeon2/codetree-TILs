import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);

        int[] nList = new int[1000001];
        int[] mList = new int[1000001];

        int nt = 1;
        for (int n = 0; n < N; n++) {
            list = br.readLine().split(" ");

            int v = Integer.parseInt(list[0]);
            int t = Integer.parseInt(list[1]);

            for (int i = 0; i < t; i++) {
                nList[nt] = nList[nt - 1] + v;

                nt++;
            }
        }

        int mt = 1;
        for (int m = 0; m < M; m++) {
            list = br.readLine().split(" ");

            int v = Integer.parseInt(list[0]);
            int t = Integer.parseInt(list[1]);

            for (int i = 0; i < t; i++) {
                mList[mt] = mList[mt - 1] + v;

                mt++;
            }
        }

        int f = 0; // 0 : n == m // 1 : n > m // 2 : n < m
        int ans = 0;

        for (int i = 0; i < nt; i++) {
            if (f != 0 && nList[i] == mList[i]) {
                ans++;
                f = 0;
            } else if (f != 1 && nList[i] > mList[i]) {
                ans++;
                f = 1;
            } else if (f != 2 && nList[i] < mList[i]) {
                ans++;
                f = 2;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}