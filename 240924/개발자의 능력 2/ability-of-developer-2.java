import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int[] list = new int[6];
        int total = 0;
        for (int i = 0; i < 6; i++) {
            list[i] = Integer.parseInt(strs[i]);
            total += list[i];
        }

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6; k++) {
                if (i == k) continue;

                for (int j = 0; j < 6; j++) {
                    if (i == j || k == j) continue;

                    for (int l = 0; l < 6; l++) {
                        if (i == l || k == l || j == l) continue;

                        int sum1 = list[i] + list[k];
                        int sum2 = list[j] + list[l];
                        int sum3 = total - sum1 - sum2;

                        int max = Math.max(sum1, Math.max(sum2, sum3));
                        int min = Math.min(sum1, Math.min(sum2, sum3));

                        diff = Math.min(diff, max - min);
                    }
                }
            }
        }

        bw.write(String.valueOf(diff));
        bw.flush();
        bw.close();
    }
}