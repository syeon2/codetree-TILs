import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String changeStr = str.substring(0, 1) + "a" + str.substring(2, str.length() - 2) + "a" + str.substring(str.length() - 1);

        bw.write(changeStr);
        bw.flush();
        bw.close();
    }
}