import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nList = new int[N];
        for (int n = 0; n < N; n++) {
            nList[n] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
            int cnt = 0;
            boolean isCont = false;

            for (int k = 0; k < N; k++) {
                int h = nList[k] - i;

                if (h > 0 && !isCont) {
                    cnt++;
                    isCont = true;
                } else if (h <= 0) isCont = false;
            }

            ans = Math.max(ans, cnt);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}