import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        int[] nList = new int[10];
        while (a > 1) {
            int mod = a % b;
            nList[mod]++;

            a /= b;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (nList[i] * nList[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}