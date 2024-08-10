import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int totalCnt = 0;
        int aCnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            totalCnt += str.length();
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == 'a') aCnt++;
            }
        }

        bw.write(totalCnt + " " + aCnt);
        bw.flush();
        bw.close();
    }
}