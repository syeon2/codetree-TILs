import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i) + 1; k++) {
                sb.append(i).append(" * ").append(k).append(" = ").append(i * k);

                if (k == (n - i) + 1) sb.append("\n");
                else sb.append(" / ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}