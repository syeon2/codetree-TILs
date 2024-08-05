import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int start = 1;
        int n = Integer.parseInt(br.readLine());

        while (start <= n) {
            sb.append(start++).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}