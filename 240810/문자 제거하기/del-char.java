import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        while (str.length() > 1) {
            int idx = Integer.parseInt(br.readLine());

            if (idx >= str.length()) str = str.substring(0, str.length() - 1);
            else str = str.substring(0, idx) + str.substring(idx + 1);

            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}