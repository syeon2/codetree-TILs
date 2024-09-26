import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] list = new int[N][3];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            list[n][0] = Integer.parseInt(strs[0]);
            list[n][1] = Integer.parseInt(strs[1]);
            list[n][2] = Integer.parseInt(strs[2]);
        }

        int ans = 0;
        for (int i = 1; i <= 3; i++) {
            int[] temp = new int[4];
            temp[i] = 1;

            int score = 0;

            for (int n = 0; n < N; n++) {
                int a = list[n][0];
                int b = list[n][1];

                int t = temp[a];
                temp[a] = temp[b];
                temp[b] = t;

                if (temp[list[n][2]] == 1) score++;
            }

            ans = Math.max(ans, score);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}