import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = str.length() - 1; i >= str.length() - n; i--) {
            bw.write(String.valueOf(str.charAt(i)));
        }

        bw.flush();
        bw.close();
    }
}