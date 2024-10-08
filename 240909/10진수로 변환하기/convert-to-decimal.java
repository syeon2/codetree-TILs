import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        int ans = 0;

        for (int i = 0; i < n.length(); i++) {
            ans = (ans * 2) + (n.charAt(i) - '0');
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}