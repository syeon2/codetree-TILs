import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ans = fibo(N);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}