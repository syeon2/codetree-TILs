import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int cnt = 1;
        char c = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                cnt++;
            } else {
                sb.append(c).append(cnt);

                c = str.charAt(i);
                cnt = 1;
            }
        }
        sb.append(c).append(cnt);

        bw.write(String.format("%d\n%s", sb.toString().length(), sb.toString()));

        bw.flush();
        bw.close();
    }
}