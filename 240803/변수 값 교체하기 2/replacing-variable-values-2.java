import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 5;
        int b = 3;
        a = b;

        bw.write(String.valueOf(a + "\n" + b));
        bw.flush();
        bw.close();
    }
}