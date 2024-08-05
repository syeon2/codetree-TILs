import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String name = (n == 1) ? "John" : (n == 2) ? "Tom" : (n == 3) ? "Paul" : "Vacancy";

        bw.write(name);
        bw.flush();
        bw.close();
    }
}