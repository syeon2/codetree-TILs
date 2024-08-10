import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < list[i].length(); k++) {
                if (cnt != 0 && cnt % 5 == 0) sb.append("\n");

                sb.append(list[i].charAt(k));
                cnt++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}