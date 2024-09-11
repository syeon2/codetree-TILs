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

            int t = Integer.parseInt(list[0]);
            String dir = list[1];

            for (int i = 0; i < t; i++) {
                if (dir.equals("R")) {
                    nList[nt] = nList[nt - 1] + 1;
                } else {
                    nList[nt] = nList[nt - 1] - 1;
                }

                nt++;
            }
        }

        int mt = 1;
        for (int m = 0; m < M; m++) {
            list = br.readLine().split(" ");

            int t = Integer.parseInt(list[0]);
            String dir = list[1];

            for (int i = 0; i < t; i++) {
                if (dir.equals("R")) {
                    mList[mt] = mList[mt - 1] + 1;
                } else {
                    mList[mt] = mList[mt - 1] - 1;
                }

                mt++;
            }
        }

        int ans = 0;
        for (int i = 2; i < 1000001; i++) {
            if (nList[i - 1] != mList[i - 1] && nList[i] == mList[i]) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}