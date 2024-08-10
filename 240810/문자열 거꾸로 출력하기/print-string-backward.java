import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            for (int i = str.length() - 1; i >= 0; i--) {
                bw.write(String.valueOf(str.charAt(i)));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}