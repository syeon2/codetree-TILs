import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ans = getAns(n);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int getAns(int n) {
        int ans = 0;
        
        for (int i = 1; i <= n; i++) {
            ans += i;
        }

        return ans / 10;
    }
}