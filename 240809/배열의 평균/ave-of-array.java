import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[][] nList = new int[2][4];
        for (int i = 0; i < 2; i++) {
            String[] list = br.readLine().split(" ");

            for (int k = 0; k < 4; k++) {
                nList[i][k] = Integer.parseInt(list[k]);
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int k = 0; k < 4; k++) {
                sum += nList[i][k];
            }

            sb.append(String.format("%.1f ", (double) sum / 4));
        }

        sb.append("\n");

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int k = 0; k < 2; k++) {
                sum += nList[k][i];
            }

            sb.append(String.format("%.1f ", (double) sum / 2));
        }

        sb.append("\n");

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 4; k++) {
                sum += nList[i][k];
            }
        }

        sb.append(String.format("%.1f ", (double) sum / 8));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}