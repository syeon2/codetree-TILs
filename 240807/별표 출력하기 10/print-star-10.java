import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int odd = 1;
        int even = n;

        for (int i = 1; i <= (n * 2); i++) {
            if (i == n + 1) {
                odd--;
                even++;
            }

            if (i <= n) {
                if (i % 2 == 1) {
                    for (int k = 1; k <= odd; k++) {
                        sb.append("* ");
                    }

                    odd++;
                    sb.append("\n");
                } else {
                    for (int k = 1; k <= even; k++) {
                        sb.append("* ");
                    }

                    even--;
                    sb.append("\n");
                }
            } else {
                if (i % 2 == 0) {
                    for (int k = 1; k <= odd; k++) {
                        sb.append("* ");
                    }

                    odd--;
                    sb.append("\n");
                } else {
                    for (int k = 1; k <= even; k++) {
                        sb.append("* ");
                    }

                    even++;
                    sb.append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}