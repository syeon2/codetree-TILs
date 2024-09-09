import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ans = fac(N);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int fac(int n) {
        if (n == 0) return 1;

        return fac(n - 1) * n;
    }
}