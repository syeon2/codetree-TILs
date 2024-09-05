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
        if (n == 1) return 2;
        else if (n == 2) return 4;

        return (recur(n - 1) * recur(n - 2)) % 100;
    }
}