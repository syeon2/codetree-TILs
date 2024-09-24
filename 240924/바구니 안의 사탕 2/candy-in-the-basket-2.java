import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        int[] nList = new int[101];

        for (int n = 0; n < N; n++) {
            strs = br.readLine().split(" ");

            int candy = Integer.parseInt(strs[0]);
            int pos = Integer.parseInt(strs[1]);

            nList[pos] += candy;
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {

            int start = Math.max(0, i - K);
            int end = Math.min(100, i + K);

            int temp = 0;
            for (int k = start; k <= end; k++) {
                temp += nList[k];
            }

            max = Math.max(max, temp);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}