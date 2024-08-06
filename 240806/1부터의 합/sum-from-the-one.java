import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int ans = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;

            if (sum >= n) {
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}