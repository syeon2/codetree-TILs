import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ans = recur(N);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int recur(int n) {
        if (n == 1 || n == 2) return n;

        return recur(n - 2) + n;
    }
}