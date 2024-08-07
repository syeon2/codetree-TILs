import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int even = 0;
        double threeMulti = 0;
        int threeCnt = 0;

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (i % 2 == 1) even += num;
            if ((i + 1) % 3 == 0) {
                threeMulti += num;
                threeCnt++;
            }
        }

        bw.write(String.format("%d %.1f", even, threeMulti / threeCnt));
        bw.flush();
        bw.close();
    }
}