import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("He says \"It's a really simple sentence\".");
        bw.flush();
        bw.close();
    }
}