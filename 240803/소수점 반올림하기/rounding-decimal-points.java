import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = 25.352;

        bw.write(String.format("%.1f", a));
        bw.flush();
        bw.close();
    }
}