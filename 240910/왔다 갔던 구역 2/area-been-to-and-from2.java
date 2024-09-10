import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nList = new int[2001];

        int curPos = 1000;

        for (int i = 0; i < N; i++) {
            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            String dir = strs[1];

            if (dir.equals("R")) {

                for (int j = curPos + 1; j <= curPos + x; j++) {
                    nList[j]++;
                }

                curPos += x;
            } else {

                for (int j = curPos; j > curPos - x; j--) {
                    nList[j]++;
                }

                curPos -= x;
            }
        }

        int ans = 0;
        for (int i = 0; i < nList.length; i++) {
            if (nList[i] >= 2) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}