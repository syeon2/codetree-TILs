import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());

        if (m < 3 || m == 12) bw.write("Winter");
        else if (m < 6) bw.write("Spring");
        else if (m < 9) bw.write("Summer");
        else bw.write("Fall");

        bw.flush();
        bw.close();
    }
}