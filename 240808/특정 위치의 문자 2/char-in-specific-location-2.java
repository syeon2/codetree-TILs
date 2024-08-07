import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        bw.write(String.format("%s %s %s", list[1], list[4], list[7]));
        bw.flush();
        bw.close();
    }
}