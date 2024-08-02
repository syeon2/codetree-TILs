import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b + c;

        a = b = c = sum;

        bw.write(String.format("%d %d %d", a, b, c));
        bw.flush();
        bw.close();
    }
}