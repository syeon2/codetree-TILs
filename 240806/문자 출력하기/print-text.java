import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 1; i <= 8; i++) {
            sb.append(str);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}