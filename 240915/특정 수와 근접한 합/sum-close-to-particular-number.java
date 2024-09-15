import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int S = Integer.parseInt(strs[1]);

        int[] nList = new int[N];
        strs = br.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(strs[i]);

            sum += nList[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int diff = sum - (nList[i] + nList[k]);

                if (ans > Math.abs(S - diff)) {
                    ans = Math.abs(S - diff);
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}