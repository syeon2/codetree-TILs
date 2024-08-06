import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num < 25) sb.append("Higher").append("\n");
            else if (num > 25) sb.append("Lower").append("\n");
            else {
                sb.append("Good");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}