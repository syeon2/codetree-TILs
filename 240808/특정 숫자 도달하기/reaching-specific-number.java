import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(list[i]);

            if (num >= 250) break;
            else {
                sum += num;
                cnt++;
            }
        }

        bw.write(String.format("%d %.1f", sum, (double) sum / cnt));
        bw.flush();
        bw.close();
    }
}