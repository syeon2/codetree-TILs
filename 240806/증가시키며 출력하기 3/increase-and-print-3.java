import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int count = 10;

        while (count <= 26) {
            sb.append(count).append(" ");
            count += 2;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}