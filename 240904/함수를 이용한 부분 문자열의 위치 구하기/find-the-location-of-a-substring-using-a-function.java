import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int ans = isTrue(str1, str2);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int isTrue(String s1, String s2) {
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            boolean temp = true;

            for (int k = 0; k < s2.length(); k++) {
                if (s1.charAt(i + k) != s2.charAt(k)) temp = false;
            }

            if (temp) return i;
        }

        return -1;
    }
}