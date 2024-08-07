import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ansCnt = 0;

        for (int i = 0; i < n; i++) {
            String[] list = br.readLine().split(" ");
            int sum = 0;

            for (int k = 0; k < 4; k++) {
                sum += Integer.parseInt(list[k]);
            }

            if (sum / 4 >= 60) {
                bw.write("pass\n");
                ansCnt++;
            } else bw.write("fail\n");
        }

        bw.write(String.valueOf(ansCnt));
        bw.flush();
        bw.close();
    }
}