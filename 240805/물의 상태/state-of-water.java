import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String tem = (n < 0) ? "ice" : (n >= 100) ? "vapor" : "water";

        bw.write(tem);
        bw.flush();
        bw.close();
    }
}