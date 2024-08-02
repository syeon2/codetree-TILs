import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Total days in Year");
        bw.newLine();
        bw.write("365");
        bw.newLine();
        bw.write("Circumference rate");
        bw.newLine();
        bw.write("3.1415926535");

        bw.flush();
        bw.close();
    }
}