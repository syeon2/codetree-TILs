import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        strs = br.readLine().split(" ");
        int[] nList = new int[n];

        for (int i = 0; i < n; i++) {
            nList[i] = Integer.parseInt(strs[i]);
        }

        int max = 0;
        for (int i = 0; i <= n - k; i++) {

            int temp = 0;

            for (int j = i; j < i + k; j++) {
                temp += nList[j];
            }

            max = Math.max(max, temp);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}