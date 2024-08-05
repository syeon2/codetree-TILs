import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) bw.write("true");
        else bw.write("false");

        bw.flush();
        bw.close();
    }
}