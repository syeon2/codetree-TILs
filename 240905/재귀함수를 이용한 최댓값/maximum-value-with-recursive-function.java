import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        String[] strs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(strs[i]);
        }

        int ans = recurMax(list, 0);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int recurMax(int[] list, int idx) {
        if (idx == list.length) return 0;

        int max = Math.max(list[idx], recurMax(list, idx + 1));

        return max;
    }
}