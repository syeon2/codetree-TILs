import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        while (cnt < 3) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 1) continue;
            else {
                sb.append(num / 2).append("\n");
                cnt++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}