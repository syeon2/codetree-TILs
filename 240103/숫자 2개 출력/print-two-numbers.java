import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("3 5");
        bw.flush();
        bw.close();
    }
}