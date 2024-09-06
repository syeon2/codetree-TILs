import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] list = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            list[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(list);

        int max = 0;

        for (int i = 0; i < N; i++) {
            int sum = list[i] + list[(2 * N) - 1 - i];

            if (sum > max) max = sum;
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}