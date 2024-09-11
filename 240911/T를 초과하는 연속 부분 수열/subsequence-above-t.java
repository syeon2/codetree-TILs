import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int t = Integer.parseInt(list[1]);

        int[] nList = new int[n];
        list = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nList[i] = Integer.parseInt(list[i]);
        }

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nList[i] > t) {
                cnt++;

                ans = Math.max(ans, cnt);
            } else {
                cnt = 0;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}