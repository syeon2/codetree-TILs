import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        int[][] list = new int[m][2];
        for (int i = 0; i < m; i++) {
            strs = br.readLine().split(" ");

            list[i][0] = Integer.parseInt(strs[0]);
            list[i][1] = Integer.parseInt(strs[1]);
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            int cnt = 1;

            for (int k = 0; k < m; k++) {
                if (i == k) continue;

                if (list[i][0] == list[k][0] && list[i][1] == list[k][1]) cnt++;
                else if (list[i][0] == list[k][1] && list[i][1] == list[k][0]) cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}