import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] list = br.readLine().split(" ");
            int w = Integer.parseInt(list[0]);
            int h = Integer.parseInt(list[1]);
            String c = list[2];

            sb.append(w * h).append("\n");

            if (c.equals("C")) break;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}