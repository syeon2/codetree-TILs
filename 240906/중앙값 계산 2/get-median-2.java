import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Integer[] list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                Arrays.sort(list, 0, i);

                sb.append(list[i / 2]).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}