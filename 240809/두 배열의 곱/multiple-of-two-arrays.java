import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[][] fList = new int[3][3];
        int[][] sList = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] list = br.readLine().split(" ");

            for (int k = 0; k < 3; k++) {
                fList[i][k] = Integer.parseInt(list[k]);
            }
        }

        br.readLine();

        for (int i = 0; i < 3; i++) {
            String[] list = br.readLine().split(" ");

            for (int k = 0; k < 3; k++) {
                sList[i][k] = Integer.parseInt(list[k]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                sb.append(fList[i][k] * sList[i][k]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}