import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);

            n /= 2;
        }

        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
    }
}