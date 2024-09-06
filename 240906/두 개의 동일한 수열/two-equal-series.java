import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] n1List = new int[N];

        for (int i = 0; i < N; i++) {
            n1List[i] = Integer.parseInt(str[i]);
        }

        str = br.readLine().split(" ");
        int[] n2List = new int[N];

        for (int i = 0; i < N; i++) {
            n2List[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(n1List);
        Arrays.sort(n2List);

        boolean ans = true;

        for (int i = 0; i < N; i++) {
            if (n1List[i] != n2List[i]) ans = false;
        }

        if (ans) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }
}