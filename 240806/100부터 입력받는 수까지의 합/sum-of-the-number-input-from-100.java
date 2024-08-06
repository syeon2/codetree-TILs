import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = n; i <= 100; i++) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}