import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            int n = Integer.parseInt(br.readLine());

            int cnt = 0;

            while (n != 1) {
                if (n % 2 == 1) n = (n * 3) + 1;
                else n /= 2;

                cnt++;
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}