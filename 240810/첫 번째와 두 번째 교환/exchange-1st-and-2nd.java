import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char c1 = str.charAt(0);
        char c2 = str.charAt(1);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c1) {
                str = str.substring(0, i) + String.valueOf(c2) + str.substring(i + 1);
            } else if (str.charAt(i) == c2) {
                str = str.substring(0, i) + String.valueOf(c1) + str.substring(i + 1);
            }
        }

        bw.write(str);
        bw.flush();
        bw.close();
    }
}