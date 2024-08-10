import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        String f = list[0];
        String s = list[1];

        if (f.length() > s.length()) {
            bw.write(f + " " + f.length());
        } else if (f.length() < s.length()) {
            bw.write(s + " " + s.length());
        } else {
            bw.write("same");
        }

        bw.flush();
        bw.close();
    }
}