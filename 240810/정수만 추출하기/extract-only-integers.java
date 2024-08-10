import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int num = 0;

        for (int i = 0; i < list.length; i++) {
            String str = list[i];
            String ans = "";

            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) >= '0' && str.charAt(k) <= '9') {
                    ans += String.valueOf(str.charAt(k));
                } else break;
            }

            num += Integer.parseInt(ans);
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();

    }
}