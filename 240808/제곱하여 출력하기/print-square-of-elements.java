import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(list[i]);

            bw.write(String.format("%d ", num * num));
        }

        bw.flush();
        bw.close();
    }
}