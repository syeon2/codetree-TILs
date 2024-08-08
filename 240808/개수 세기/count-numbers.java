import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(line2[i]);

            if (num == m) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}