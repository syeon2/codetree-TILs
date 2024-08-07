import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int idx = -1;

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num == 0) break;
            else idx++;
        }

        int sum = 0;
        for (int i = idx; i > idx - 3; i--) {
            sum += Integer.parseInt(list[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}