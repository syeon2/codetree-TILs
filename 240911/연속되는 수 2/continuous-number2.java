import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int num = 0;
        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (num != n) {
                ans = Math.max(cnt, ans);

                cnt = 1;
                num = n;
            } else {
                cnt++;
            }
        }

        ans = Math.max(ans, cnt);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}