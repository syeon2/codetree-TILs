import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int underMax = 0;
        int upMin = 1001;

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num < 500 && underMax < num) underMax = num;
            if (num > 500 && upMin > num) upMin = num;
        }

        bw.write(String.format("%d %d", underMax, upMin));
        bw.flush();
        bw.close();
    }
}