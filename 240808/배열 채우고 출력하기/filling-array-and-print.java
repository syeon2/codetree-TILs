import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        for (int i = 9; i >= 0; i--) {
            bw.write(String.valueOf(list[i]));
        }

        bw.flush();
        bw.close();
    }
}