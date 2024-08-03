import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int w = Integer.parseInt(list[0]) + 8;
        int h = Integer.parseInt(list[1]) * 3;

        sb.append(w).append("\n")
            .append(h).append("\n")
            .append(w * h);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}