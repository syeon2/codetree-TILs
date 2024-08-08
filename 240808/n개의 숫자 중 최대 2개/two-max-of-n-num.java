import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(list[i]);

            if (max < num) {
                max = num;
                idx = i;
            }
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(list[i]);

            if (secondMax < num && i != idx) secondMax = num;
        }

        bw.write(String.format("%d %d", max, secondMax));
        bw.flush();
        bw.close();
    }
}