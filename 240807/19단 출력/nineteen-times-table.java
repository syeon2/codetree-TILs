import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 19; i++) {
            for (int k = 0; k < 19; k++) {
                sb.append(i).append(" * ").append(k + 1).append(" = ").append(i * (k + 1));

                if (k % 2 == 0 && (k + 1) != 19) sb.append(" / ");
                else sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}