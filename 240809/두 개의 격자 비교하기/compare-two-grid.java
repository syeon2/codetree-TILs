import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        int[][] fList = new int[a][b];
        int[][] sList = new int[a][b];

        for (int i = 0; i < a; i++) {
            list = br.readLine().split(" ");

            for (int k = 0; k < b; k++) {
                fList[i][k] = Integer.parseInt(list[k]);
            }
        }

        for (int i = 0; i < a; i++) {
            list = br.readLine().split(" ");

            for (int k = 0; k < b; k++) {
                sList[i][k] = Integer.parseInt(list[k]);
            }
        }

        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b; k++) {
                if (fList[i][k] == sList[i][k]) sb.append(0).append(" ");
                else sb.append(1).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}