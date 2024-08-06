import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int threeCnt = 0;
        int fiveCnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine().trim());

            if (num % 3 == 0) threeCnt++;
            if (num % 5 == 0) fiveCnt++;
        }

        bw.write(threeCnt + " " + fiveCnt);
        bw.flush();
        bw.close();
    }
}