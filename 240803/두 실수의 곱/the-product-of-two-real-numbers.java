import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = 5.26;
        double b = 8.27;

        bw.write(String.format("%.3f", (a * b)));
        bw.flush();
        bw.close();
    }
}