import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);

        int[] students = new int[N];
        for (int n = 0; n < N; n++) {
            students[n] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(students);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tempN = B;

            for (int k = 0; k < N; k++) {
                if (i == k) tempN -= students[k] / 2;
                else tempN -= students[k];

                if (tempN < 0) {
                    ans = Math.max(ans, k);
                    break;
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}