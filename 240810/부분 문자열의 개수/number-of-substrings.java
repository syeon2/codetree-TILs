import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int cnt = 0;
        int idx = 0;

        while (idx != -1) {
            int nextIdx = str1.indexOf(str2, idx);

            if (nextIdx == -1) break;

            cnt++;
            idx = nextIdx + 1;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}