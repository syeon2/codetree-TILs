import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 10; i++) {
            String str = br.readLine();

            if (str.charAt(str.length() - 1) == 'e') bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}