import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        if (a >= b) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        if (a > b) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        if (b >= a) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        if (b > a) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        if (a == b) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        if (a != b) sb.append(1).append("\n");
        else sb.append(0).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}