import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double ft = 30.48;
        double mi = 160934;

        double a = 9.2;
        double b = 1.3;

        bw.write(String.format("%.1fft = %.1fcm", a, (a * ft)));
        bw.newLine();
        bw.write(String.format("%.1fmi = %.1fcm", b, (b * mi)));

        bw.flush();
        bw.close();
    }
}