import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 5;
        int b = 6;
        int c = 7;

        a = b = c;

        bw.write(String.format("%d %d %d", a, b, c));
        bw.flush();
        bw.close();
    }
}