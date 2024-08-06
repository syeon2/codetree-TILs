import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        int end = n;

        for (int i = 1; i <= end; i++) {
            n /= i;
            cnt++;

            if (n <= 1) break;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}