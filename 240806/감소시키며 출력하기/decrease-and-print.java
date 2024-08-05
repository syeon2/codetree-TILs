import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 17; i >= 5; i--) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}