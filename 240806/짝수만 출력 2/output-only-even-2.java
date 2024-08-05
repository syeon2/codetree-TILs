import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int b = Integer.parseInt(list[0]);
        int a = Integer.parseInt(list[1]);

        while (a <= b) {
            if (a % 2 == 0) sb.append(a).append(" ");

            a++;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}