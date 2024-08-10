import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        while (true) {
            int idx = str1.indexOf(str2);

            if (idx == -1) break;
            else str1 = str1.substring(0, idx) + str1.substring(idx + str2.length());
        }

        bw.write(str1);
        bw.flush();
        bw.close();
    }
}