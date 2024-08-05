import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        String grade = (score == 100) ? "pass" : "failure";

        bw.write(grade);
        bw.flush();
        bw.close();
    }
}