import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int n = 1;

        for (int i = 1; i <= (N * 2) - 1; i++) {

            for (int k = 1; k <= n; k++) {
                sb.append("*");
            }
            sb.append("\n\n");

            if (i < N) n++;
            else n--;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}