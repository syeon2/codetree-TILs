import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int[] nList = new int[6];

        int total = 0;
        for (int i = 0; i < 6; i++) {
            nList[i] = Integer.parseInt(strs[i]);

            total += nList[i];
        }

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int k = i + 1; k < 6; k++) {
                for (int j = k + 1; j < 6; j++) {
                    int sum = nList[i] + nList[k] + nList[j];

                    diff = Math.min(diff, Math.abs((total - sum) - sum));
                }
            }
        }

        bw.write(String.valueOf(diff));
        bw.flush();
        bw.close();
    }
}