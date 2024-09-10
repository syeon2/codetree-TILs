import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        int N = list[0];
        int K = list[1];

        int[] nList = new int[N + 1];

        for (int i = 0; i < K; i++) {
            list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

            int a = list[0];
            int b = list[1];

            for (int k = a; k <= b; k++) {
                nList[k]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, nList[i]);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}