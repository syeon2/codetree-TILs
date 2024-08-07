import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        double sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += Double.parseDouble(list[i]);
        }

        bw.write(String.format("%.1f", sum / 8));
        bw.flush();
        bw.close();
    }
}