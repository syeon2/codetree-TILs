import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        char a = list[0].charAt(0);
        int b = Integer.parseInt(list[1]);

        bw.write((int) a + " " + (char) b);
        bw.flush();
        bw.close();
    }
}