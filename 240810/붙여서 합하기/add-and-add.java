import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int ab = Integer.parseInt(list[0] + list[1]);
        int ba = Integer.parseInt(list[1] + list[0]);

        bw.write(String.valueOf(ab + ba));
        bw.flush();
        bw.close();
    }
}