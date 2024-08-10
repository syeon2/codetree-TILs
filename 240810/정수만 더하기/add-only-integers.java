import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') cnt += c - '0';
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}