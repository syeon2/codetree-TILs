import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 97;
        int b = 13;

        StringBuilder sb = new StringBuilder();

        sb.append(a).append(" - ").append(b).append(" = ").append(a - b);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}