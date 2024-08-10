import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine().replace(" ", "");
        String str2 = br.readLine().replace(" ", "");

        bw.write(str1 + str2);
        bw.flush();
        bw.close();
    }
}