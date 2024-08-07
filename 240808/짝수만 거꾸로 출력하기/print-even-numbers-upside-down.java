import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        for (int i = n - 1; i >= 0; i--) {
            int num = Integer.parseInt(list[i]);

            if (num % 2 == 0) bw.write(String.format("%d ", num));
        }

        bw.flush();
        bw.close();
    }
}