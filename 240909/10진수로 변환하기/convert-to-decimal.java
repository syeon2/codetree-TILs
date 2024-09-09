import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        int prod = 1;
        while (n != 0) {
            ans += (prod * (n % 10));

            prod *= 2;
            n /= 10;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}