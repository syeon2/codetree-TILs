import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int n = N;

        for (int i = 1; i <= (N * 2) - 1; i++) {

            for (int k = n; k >= 1; k--) {
                sb.append("* ");
            }
            sb.append("\n");

            if (i < N) n--;
            else n++;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}