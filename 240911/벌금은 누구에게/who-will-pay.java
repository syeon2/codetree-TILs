import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);
        int K = Integer.parseInt(list[2]);

        int[] nList = new int[N + 1];

        int ans = -1;

        for (int m = 0; m < M; m++) {
            int n = Integer.parseInt(br.readLine());

            nList[n]++;

            if (nList[n] == K) {
                ans = n;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}