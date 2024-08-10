import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                char c = (char) (str.charAt(i) - 'a' + 'A');

                bw.write(String.valueOf(c));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                bw.write(String.valueOf(str.charAt(i)));
            }
        }

        bw.flush();
        bw.close();
    }
}