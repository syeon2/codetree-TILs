import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int k = 0; k < n; k++) {
                    sb.append("* ");
                }
            } else {
                sb.append("  ");

                for (int k = 0; k < (i / 2); k++) {
                    sb.append("    ");
                }

                for (int k = 0; k < (n / 2) - (i / 2); k++) {
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