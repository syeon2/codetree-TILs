import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(":");
        int h = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        bw.write((h + 1) + ":" + m);
        bw.flush();
        bw.close();
    }
}