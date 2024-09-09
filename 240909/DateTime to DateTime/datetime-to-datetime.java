import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        if ((a == 11 && b < 11) || (a == 11 && b == 11 && c < 11)) bw.write("-1");
        else {
            int start = (11 * 60 * 24) + (60 * 11) + 11;
            int end = (a * 60 * 24) + (60 * b) + c;

            bw.write(String.valueOf(end - start));
        }

        bw.flush();
        bw.close();
    }
}