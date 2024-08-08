import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int min = Integer.parseInt(list[0]);
        int maxProfix = 0;

        for (int i = 1; i < n; i++) {
            int sell = Integer.parseInt(list[i]);

            if (sell - min > maxProfix) maxProfix = sell - min;
            if (sell < min) min = sell;
        }

        bw.write(String.valueOf(maxProfix));
        bw.flush();
        bw.close();
    }
}