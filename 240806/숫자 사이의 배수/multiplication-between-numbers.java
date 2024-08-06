import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        int sum = 0;
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        bw.write(String.format("%d %.1f", sum, avg));
        bw.flush();
        bw.close();
    }
}