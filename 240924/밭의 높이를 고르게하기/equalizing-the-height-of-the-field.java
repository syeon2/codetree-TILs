import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int N = Integer.parseInt(strs[0]);
        int T = Integer.parseInt(strs[1]);
        int H = Integer.parseInt(strs[2]);

        int[] land = new int[N];
        strs = br.readLine().split(" ");
        for (int n = 0; n < N; n++) {
            land[n] = Integer.parseInt(strs[n]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - T; i++) {

            int temp = 0;
            for (int k = i; k < i + T; k++) {
                temp += Math.abs(land[k] - H);
            }

            min = Math.min(min, temp);
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}