import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int n = Integer.parseInt(list[1]);

        for (int i = 1; i <= n; i++) {
            sb.append(a + n).append("\n");
            a += n;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}