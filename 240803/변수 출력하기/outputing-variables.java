import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 3;
        char b = 'C';

        bw.write(String.format("%d...%c", a, b));
        bw.flush();
        bw.close();
    }
}