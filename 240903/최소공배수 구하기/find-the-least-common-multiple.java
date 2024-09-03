import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        int ans = lcm(n, m);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }

    public static int gcd(int n, int m) {
        if (n % m == 0) return m;

        return gcd(m, n % m);
    }
}