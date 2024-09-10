import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nList = new int[101];

        for (int i = 0; i < N; i++) {
            String[] strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]);
            int x2 = Integer.parseInt(strs[1]);

            for (int k = x1; k <= x2; k++) {
                nList[k]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < nList.length; i++) {
            ans = Math.max(ans, nList[i]);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}