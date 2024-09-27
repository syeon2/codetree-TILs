import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] aList = new int[N];
        int[] bList = new int[N];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

            aList[n] = a;
            bList[n] = b;
        }

        int ans = 0;
        for (int i = 1; i <= 10000; i++) {

            boolean can = true;
            int temp = i * 2;

            for (int n = 0; n < N; n++) {
                int a = aList[n];
                int b = bList[n];

                if (a <= temp && temp <= b) temp *= 2;
                else {
                    can = false;
                    break;
                }
            }

            if (can) {
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}