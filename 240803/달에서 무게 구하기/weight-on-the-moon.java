import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%d * %.6f = %.6f", 13, 0.165000, 2.145000));
        bw.flush();
        bw.close();
    }
}