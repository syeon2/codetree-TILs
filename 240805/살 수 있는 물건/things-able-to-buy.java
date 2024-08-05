import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String item = (n >= 3000) ? "book" : (n >= 1000) ? "mask" : "no";

        bw.write(item);
        bw.flush();
        bw.close();
    }
}