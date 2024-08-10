import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = new String[4];
        for (int i = 0; i < 4; i++) {
            list[i] = br.readLine();
        }

        for (int i = 3; i >= 0; i--) {
            bw.write(list[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}