import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 7;
        int b = 23;
        int c = 30;

        bw.write(String.valueOf(a));
        bw.write(" + ");
        bw.write(String.valueOf(b));
        bw.write(" = ");
        bw.write(String.valueOf(c));

        bw.flush();
        bw.close();
    }
}