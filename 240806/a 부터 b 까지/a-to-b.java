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

        while (a <= b) {
            sb.append(a).append(" ");

            if (a % 2 == 1) a *= 2;
            else a += 3;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}