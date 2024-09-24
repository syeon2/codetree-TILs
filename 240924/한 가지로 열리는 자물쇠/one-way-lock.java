import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        int[] nList = new int[3];
        for (int i = 0; i < 3; i++) {
            nList[i] = Integer.parseInt(strs[i]);
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {

                for (int j = 1; j <= N; j++) {
                    if (Math.abs(i - nList[0]) <= 2 || Math.abs(k - nList[1]) <= 2 || Math.abs(j - nList[2]) <= 2) {
                        cnt++;
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}