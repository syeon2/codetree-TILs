import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int q = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().split(" ");
        int[] nList = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(line2[i]);

            nList[i] = num;
        }

        for (int i = 0; i < q; i++) {
            String[] list = br.readLine().split(" ");

            int question = Integer.parseInt(list[0]);

            if (question == 1) {
                int a = Integer.parseInt(list[1]);

                sb.append(nList[a - 1]).append("\n");
            } else if (question == 2) {
                int b = Integer.parseInt(list[1]);
                int idx = 0;

                for (int k = 0; k < nList.length; k++) {
                    if (nList[k] == b) {
                        idx = k + 1;
                        break;
                    }
                }

                sb.append(idx).append("\n");
            } else {
                int s = Integer.parseInt(list[1]);
                int e = Integer.parseInt(list[2]);

                for (int k = s - 1; k < e; k++) {
                    sb.append(nList[k]).append(" ");
                }

                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}