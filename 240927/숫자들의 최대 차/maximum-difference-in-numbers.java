import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        int ans = 0;

        int sIdx = 0;
        int eIdx = N - 1;

        while (sIdx <= eIdx) {
            if (list[eIdx] - list[sIdx] <= K) {
                ans = (eIdx - sIdx) + 1;
                break;
            }

            if ((sIdx + 1 < N && (list[eIdx] - list[sIdx + 1] < list[eIdx - 1] - list[sIdx]))) {
                sIdx += 1;
            } else eIdx -= 1;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}