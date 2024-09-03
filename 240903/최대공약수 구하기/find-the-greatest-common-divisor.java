import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) ans = i;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}