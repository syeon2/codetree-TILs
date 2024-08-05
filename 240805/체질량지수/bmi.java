import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int h = Integer.parseInt(list[0]);
        int w = Integer.parseInt(list[1]);

        int b = (10000 * w) / (h * h);

        sb.append(b).append("\n");

        if (b >= 25) sb.append("Obesity");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}