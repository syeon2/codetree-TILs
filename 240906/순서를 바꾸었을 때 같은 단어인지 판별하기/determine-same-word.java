import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list1 = br.readLine().toCharArray();
        char[] list2 = br.readLine().toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        boolean ans = true;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) ans = false;
        }

        if (ans) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }
}