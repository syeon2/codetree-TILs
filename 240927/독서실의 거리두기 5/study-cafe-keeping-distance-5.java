import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] list = br.readLine().toCharArray();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] == '1') continue;
            
            list[i] = '1';
            int dist = 100;

            for (int k = 0; k < N; k++) {
                if (list[k] == '0') continue;

                for (int j = k + 1; j < N; j++) {
                    if (list[j] == '0') continue;

                    dist = Math.min(dist, Math.abs(k - j));
                    break;
                }
            }

            list[i] = '0';
            ans = Math.max(ans, dist);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}