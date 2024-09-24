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

        int cnt = 0;
        for (int w = 1; w <= N; w++) {

            for (int i = 0; i <= N - w; i++) {
                int sum = 0;

                for (int k = i; k < i + w; k++) {
                    sum += nList[k];
                }

                double avg = (double) sum / w;

                for (int k = i; k < i + w; k++) {
                    if (nList[k] == avg) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}