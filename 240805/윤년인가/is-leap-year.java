import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());

        if (y % 4 == 0 || !(y % 100 == 0 && y % 400 > 0)) bw.write("true");
        else bw.write("false");

        bw.flush();
        bw.close();
    }
}