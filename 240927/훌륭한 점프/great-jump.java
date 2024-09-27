import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        strs = br.readLine().split(" ");
        int[] list = new int[N];
        for (int n = 0; n < N; n++) {
            list[n] = Integer.parseInt(strs[n]);
        }

        int ans = 0;
        for (int i = Math.max(list[0], list[N - 1]); i <= 100; i++) {

            boolean canJump = true;
            int lastIndex = 0;

            for (int k = 0; k < N; k++) {
                if (list[k] <= i && k - lastIndex <= K) {
                    lastIndex = k;
                } else if (k - lastIndex > K) canJump = false;
            }

            if (canJump) {
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}