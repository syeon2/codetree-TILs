import java.io.*;

public class Main {

    public static int[] monthes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int m1 = Integer.parseInt(list[0]);
        int d1 = Integer.parseInt(list[1]);
        int m2 = Integer.parseInt(list[2]);
        int d2 = Integer.parseInt(list[3]);

        int total = 1;

        while (true) {
            if (m1 == m2 && d1 == d2) break;

            if (++d1 > monthes[m1]) {
                d1 = 1;
                m1++;
            }

            total++;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}