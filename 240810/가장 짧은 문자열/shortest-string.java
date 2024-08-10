import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int max = Math.max(str1.length(), Math.max(str2.length(), str3.length()));
        int min = Math.min(str1.length(), Math.min(str2.length(), str3.length()));

        bw.write(String.valueOf(max - min));
        bw.flush();
        bw.close();
    }
}