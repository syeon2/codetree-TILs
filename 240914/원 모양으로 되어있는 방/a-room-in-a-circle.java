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

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int temp = 0;

            for (int k = 0; k < N; k++) {
                int dist = (N + k - i) % N;

                temp += dist * nList[k];
            }

            ans = Math.min(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}