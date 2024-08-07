import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= (n * 2) + 1; i++) {
            if (i % 2 == 1) {
                for (int k = 1; k <= (n * 2) + 1; k++) {
                    sb.append("* ");
                }
            } else {
                for (int k = 1; k <= n + 1; k++) {
                    sb.append("*   ");
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}