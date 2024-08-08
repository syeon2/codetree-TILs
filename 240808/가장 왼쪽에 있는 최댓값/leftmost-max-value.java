import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int endIdx = N;

        while (endIdx != 0) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;

            for (int i = 0; i < endIdx; i++) {
                int num = Integer.parseInt(list[i]);

                if (num > max) {
                    max = num;
                    maxIdx = i;
                }
            }

            sb.append(maxIdx + 1).append(" ");
            endIdx = maxIdx;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}