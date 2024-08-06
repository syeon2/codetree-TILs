import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int ans = 0;

        while (start != N) {
            ans++;
            start *= 2;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}