import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double ft = 30.48;
        double b = Double.parseDouble(br.readLine());

        b = ft * b;

        System.out.printf("%.1f", b);
    }
}