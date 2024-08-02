import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());

        double ft = 30.48;

        bw.write(String.format("%.1f", n * ft));
        bw.flush();
        bw.close();
    }
}