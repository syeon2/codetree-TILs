import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        int[] nList = new int[N];
        for (int n = 0; n < N; n++) {
            nList[n] = Integer.parseInt(strs[n]);
        }

        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            int temp = 0;

            for (int k = 0; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    int start = nList[k];
                    int end = nList[j];

                    if (Math.abs(start - i) == Math.abs(end - i)) temp++;
                }
            }

            ans = Math.max(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}