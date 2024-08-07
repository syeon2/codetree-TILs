import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int k = 0; k < n; k++) {
                    sb.append(++cnt).append(" ");
                }
            } else {
                for (int k = 0; k < n; k++) {
                    cnt += 2;
                    sb.append(cnt).append(" ");
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}