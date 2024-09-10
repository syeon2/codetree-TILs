import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nList = new int[200001];

        int curPos = 100000;

        for (int i = 0; i < N; i++) {
            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            String dir = strs[1];

            if (dir.equals("R")) {

                for (int k = curPos; k < curPos + x; k++) {
                    nList[k] = 2;
                }

                curPos += (x - 1);
            } else {

                for (int k = curPos; k > curPos - x; k--) {
                    nList[k] = 1;
                }

                curPos -= (x - 1);
            }
        }

        int white = 0;
        int black = 0;

        for (int i = 0; i < nList.length; i++) {
            if (nList[i] == 1) white++;
            else if (nList[i] == 2) black++;
        }

        bw.write(white + " " + black);
        bw.flush();
        bw.close();
    }
}