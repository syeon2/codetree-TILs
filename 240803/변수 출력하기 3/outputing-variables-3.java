import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 1;
        int b = 2;
        char c = 'C';

        bw.write(String.format("%d->%d->%c", a, b, c));
        bw.flush();
        bw.close();
    }
}