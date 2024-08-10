import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        String a = list[0];
        String b = list[1];

        String ans = a.substring(0, 2) + b.substring(2);

        bw.write(ans);
        bw.flush();
        bw.close();
    }
}