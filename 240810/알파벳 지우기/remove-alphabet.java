import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;

        for (int i = 0; i < 2; i++) {
            String str = br.readLine();

            String num = "";

            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) >= '0' && str.charAt(k) <= '9') num += String.valueOf(str.charAt(k));
            }

            ans += Integer.parseInt(num);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}