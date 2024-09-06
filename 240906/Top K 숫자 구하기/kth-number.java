import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int k = Integer.parseInt(list[1]);

        list = br.readLine().split(" ");

        int[] nList = new int[N];
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(list[i]);
        }

        Arrays.sort(nList);

        bw.write(String.valueOf(nList[k - 1]));
        bw.flush();
        bw.close();
    }
}