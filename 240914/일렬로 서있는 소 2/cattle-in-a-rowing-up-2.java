import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(strs[i]);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    if (list[i] <= list[k] && list[k] <= list[j]) ans++;
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}