import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nList = new int[N];
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 1;
        int ans = 1;

        for (int i = 1; i < N; i++) {
            if (nList[i - 1] < nList[i]) {
                cnt++;

                ans = Math.max(ans, cnt);
            } else {
                cnt = 1;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}