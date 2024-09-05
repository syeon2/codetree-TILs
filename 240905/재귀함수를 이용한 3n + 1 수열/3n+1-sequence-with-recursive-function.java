import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ans = recur(n, 0);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int recur(int n, int cnt) {
        if (n == 1) return cnt;

        if (n % 2 == 0) return recur(n / 2, cnt + 1);
        else return recur((n * 3) + 1, cnt + 1);
    }
}