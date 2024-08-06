import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int cnt = 0;

        while (true) {
            int age = Integer.parseInt(br.readLine());

            if (age >= 20 && age < 30) {
                sum += age;
                cnt++;
            } else break;
        }

        bw.write(String.format("%.2f", (double) sum / cnt));
        bw.flush();
        bw.close();
    }
}