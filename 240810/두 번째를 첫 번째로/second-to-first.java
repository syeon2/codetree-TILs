import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char c1 = str.charAt(0);
        char c2 = str.charAt(1);

        str = str.replace(c2, c1);

        bw.write(str);
        bw.flush();
        bw.close();
    }
}