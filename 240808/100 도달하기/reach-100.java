import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nList = new int[101];
        nList[0] = 1;
        nList[1] = n;

        for (int i = 0; i < nList.length; i++) {
            if (i < 2) bw.write(String.format("%d ", nList[i]));
            else {
                nList[i] = nList[i - 1] + nList[i - 2];

                bw.write(String.format("%d ", nList[i]));

                if (nList[i] > 100) break;
            }
        }

        bw.flush();
        bw.close();
    }
}