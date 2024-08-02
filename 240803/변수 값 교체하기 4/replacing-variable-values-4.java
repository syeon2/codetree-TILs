import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 7;
        a = 4;

        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}