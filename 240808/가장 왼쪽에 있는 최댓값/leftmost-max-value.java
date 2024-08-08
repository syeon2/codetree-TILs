import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int[] nList = new int[n];
        for (int i = 0; i < n; i++) {
            nList[i] = Integer.parseInt(list[i]);
        }

        int[] ans = new int[n];
        int idx = 0;
        int value = nList[idx];

        for (int i = 0; i < n; i++) {
            if (value < nList[i]) {
                ans[++idx] = i;
                value = nList[i];
            }
        }

        for (int i = idx; i >= 0; i--) {
            sb.append(ans[i] + 1).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}