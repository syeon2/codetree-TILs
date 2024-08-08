import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int max = -1000;
        int min = 1000;

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num == 999 || num == -999) break;

            if (max < num) max = num;
            if (min > num) min = num;
        }

        bw.write(String.format("%d %d", max, min));
        bw.flush();
        bw.close();
    }
}