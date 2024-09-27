import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int[] list = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            list[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(list);

        int a = list[0];
        int b = list[1];
        int c = list[list.length - 1 - 2] - list[list.length - 1 - 3] + b;
        int d = list[list.length - 2] - b - c;

        bw.write(a + " " + b + " " + c + " " + d);
        bw.flush();
        bw.close();
    }
}