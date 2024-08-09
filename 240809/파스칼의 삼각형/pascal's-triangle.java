import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] nList = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int k = 0; k <= i; k++) {
                if (i == 0 || k == 0) nList[i][k] = 1;
                else nList[i][k] = nList[i - 1][k - 1] + nList[i - 1][k];

                sb.append(nList[i][k]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}