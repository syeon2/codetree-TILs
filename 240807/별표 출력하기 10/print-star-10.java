import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int odd = 1;
        int even = N;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                for (int k = 1; k <= odd; k++) {
                    sb.append("* ");
                }

                sb.append("\n");
                odd++;
            } else {
                for (int k = 1; k <= even; k++) {
                    sb.append("* ");
                }

                sb.append("\n");
                even--;
            }
        }

        odd--;
        even++;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                for (int k = 1; k <= odd; k++) {
                    sb.append("* ");
                }

                sb.append("\n");
                odd--;
            } else {
                for (int k = 1; k <= even; k++) {
                    sb.append("* ");
                }

                sb.append("\n");
                even++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}