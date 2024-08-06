import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) break;

            bw.write(String.valueOf(num));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}