import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);

        int[] nList = new int[1001];
        int[] mList = new int[1001];

        for (int i = 1; i < 1001; i++) {
            nList[i] = Integer.MAX_VALUE;
            mList[i] = Integer.MAX_VALUE;
        }

        int nt = 1;
        int mt = 1;

        for (int i = 0; i < N; i++) {
            list = br.readLine().split(" ");

            String dir = list[0];
            int move = Integer.parseInt(list[1]);

            for (int k = 1; k <= move; k++) {
                if (dir.equals("R")) {
                    nList[nt] = nList[nt - 1] + 1;
                } else {
                    nList[nt] = nList[nt - 1] - 1;
                }

                nt++;
            }
        }

        for (int i = 0; i < M; i++) {
            list = br.readLine().split(" ");

            String dir = list[0];
            int move = Integer.parseInt(list[1]);

            for (int k = 1; k <= move; k++) {
                if (dir.equals("R")) {
                    mList[mt] = mList[mt - 1] + 1;
                } else {
                    mList[mt] = mList[mt - 1] - 1;
                }

                mt++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= 1000; i++) {
            if (nList[i] == mList[i]) {
                if (nList[i] == Integer.MAX_VALUE) ans = -1;
                else ans = i;

                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}