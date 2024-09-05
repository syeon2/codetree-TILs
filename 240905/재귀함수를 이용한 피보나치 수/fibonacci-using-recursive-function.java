import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int first = 1;
        int second = 1;

        int ans = recurFibo(first, second, N, 3);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int recurFibo(int f, int s, int n, int start) {
        if (n == 1) return f;
        else if (n == s) return s;
        else if (start > n) return s;

        int nextNum = f + s;

        return recurFibo(s, nextNum, n, start + 1);
    }
}