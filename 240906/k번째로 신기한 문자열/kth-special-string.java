import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        String T = strs[2];

        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        Arrays.sort(list);

        int cnt = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {

            String value = list[i];

            if (value.length() < T.length()) continue;
            else {
                boolean temp = true;

                for (int l = 0; l < T.length(); l++) {
                    if (value.charAt(l) != T.charAt(l)) temp = false;
                }

                if (temp) cnt++;
            }

            if (cnt == k) ans = value;
        }

        bw.write(ans);
        bw.flush();
        bw.close();
    }
}