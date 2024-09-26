import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int C = Integer.parseInt(strs[1]);
        int G = Integer.parseInt(strs[2]);
        int H = Integer.parseInt(strs[3]);

        int[] temper = new int[1001];
        for (int n = 0; n < N; n++) {
            strs = br.readLine().split(" ");

            int Ta = Integer.parseInt(strs[0]);
            int Tb = Integer.parseInt(strs[1]);

            for (int i = 0; i <= 1000; i++) {
                if (i < Ta) temper[i] += C;
                else if (i >= Ta && i <= Tb) temper[i] += G;
                else temper[i] += H;
            }
        }

        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
            ans = Math.max(ans, temper[i]);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}