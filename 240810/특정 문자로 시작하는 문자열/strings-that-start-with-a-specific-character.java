import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        char c = br.readLine().charAt(0);

        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (list[i].charAt(0) == c) {
                sum += list[i].length();
                cnt++;
            }
        }

        bw.write(String.format("%d %.2f", cnt, sum / cnt));
        bw.flush();
        bw.close();
    }
}