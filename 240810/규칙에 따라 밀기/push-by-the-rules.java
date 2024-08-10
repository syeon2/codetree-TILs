import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] cmds = br.readLine().toCharArray();

        for (int i = 0; i < cmds.length; i++) {
            if (cmds[i] == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            } else {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        bw.write(str);
        bw.flush();
        bw.close();
    }
}