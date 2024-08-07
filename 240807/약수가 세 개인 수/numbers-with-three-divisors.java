import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int start = Integer.parseInt(list[0]);
        int end = Integer.parseInt(list[1]);

        int ans = 0;

        for (int i = start; i <= end; i++) {
            int cnt = 0;

            for (int k = 1; k <= i; k++) {
                if (i % k == 0) cnt++;
            }

            if (cnt == 3) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}