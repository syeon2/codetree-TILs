import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = 10;

        while (a <= 26) {
            sb.append(a++).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}