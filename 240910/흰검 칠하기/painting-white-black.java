import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 0 없음, 1 흰색, 2 검은색, 3 회색
        int[] nList = new int[200001];
        int[] whiteCache = new int[200001];
        int[] blackCache = new int[200001];

        int curPos = 100000;

        for (int n = 0; n < N; n++) {

            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            String dir = strs[1];

            if (dir.equals("R")) {

                for (int k = curPos; k < curPos + x; k++) {
                    if (nList[k] == 3) continue;

                    nList[k] = 2;
                    blackCache[k]++;

                    if (whiteCache[k] >= 2 && blackCache[k] >= 2) nList[k] = 3;
                }

                curPos += x - 1;
            } else {
                for (int k = curPos; k > curPos - x; k--) {
                    if (nList[k] == 3) continue;

                    nList[k] = 1;
                    whiteCache[k]++;

                    if (whiteCache[k] >= 2 && blackCache[k] >= 2) nList[k] = 3;
                }

                curPos -= x - 1;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i < nList.length; i++) {
            if (nList[i] == 1) white++;
            else if (nList[i] == 2) black++;
            else if (nList[i] == 3) gray++;
        }

        bw.write(white + " " + black + " " + gray);
        bw.flush();
        bw.close();
    }
}