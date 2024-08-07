import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[101];

        int cnt = 0;

        for (int i = 1; i <= 100; i++) {
            int num = n * i;

            list[i] = num;

            if (list[i] % 5 == 0) cnt++;
            if (cnt == 2) break;
        }

        for (int i = 1; i < list.length; i++) {
            if (list[i] == 0) break;

            bw.write(String.format("%d ", list[i]));
        }

        bw.flush();
        bw.close();
    }
}