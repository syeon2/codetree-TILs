import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] alp = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            alp[idx]++;
        }

        boolean result = isTrue(alp);

        if (result) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }

    public static boolean isTrue(int[] list) {
        int cnt = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0 && list[i] >= 1) cnt++;
        }

        return cnt > 1;
    }
}