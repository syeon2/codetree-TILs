import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') bw.write(String.valueOf((char) (c - 'a' + 'A')));
            else bw.write(String.valueOf((char) (c - 'A' + 'a')));
        }

        bw.flush();
        bw.close();
    }
}