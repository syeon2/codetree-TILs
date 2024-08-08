import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int max = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(list[i]);

            if (num > max) max = num;
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}