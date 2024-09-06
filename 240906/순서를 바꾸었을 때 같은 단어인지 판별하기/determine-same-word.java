import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list1 = br.readLine().toCharArray();
        char[] list2 = br.readLine().toCharArray();

        int[] alp1 = new int[26];
        int[] alp2 = new int[26];

        boolean ans = true;

        if (list1.length != list2.length) ans = false;
        else {
            for (int i = 0; i < list1.length; i++) {
                int v1 = list1[i] - 'a';
                int v2 = list2[i] - 'a';

                alp1[v1]++;
                alp2[v2]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (alp1[i] != alp2[i]) ans = false;
        }

        if (ans) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }
}