import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int A = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);
        int C = Integer.parseInt(strs[2]);

        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i * A > C) break;

            for (int k = 0; k <= 1000; k++) {
                if ((i * A) + (k * B) > C) break;

                ans = Math.max(ans, (i * A) + (k * B));
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}