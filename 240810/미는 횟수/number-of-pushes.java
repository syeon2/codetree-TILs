import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int cnt = 0;
        while (cnt <= str1.length()) {
            if (str1.equals(str2)) break;

            cnt++;
            str1 = str1.substring(str1.length() - 1) + str1.substring(0, str1.length() - 1);
        }

        if (cnt == 0) bw.write("-1");
        else bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}