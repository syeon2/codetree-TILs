import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 1) sb.append("John").append("\n");
            else if (num == 2) sb.append("Tom").append("\n");
            else if (num == 3) sb.append("Paul").append("\n");
            else if (num == 4) sb.append("Sam").append("\n");
            else {
                sb.append("Vacancy");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}