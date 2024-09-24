import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        char[] list = new char[10001];

        for (int i = 0; i < N; i++) {

            strs = br.readLine().split(" ");

            int pos = Integer.parseInt(strs[0]);
            char alp = strs[1].charAt(0);

            list[pos] = alp;
        }

        int max = 0;
        for (int i = 1; i < 10001 - K; i++) {
            int temp = 0;

            for (int k = i; k <= i + K; k++) {
                if (list[k] == 'G') temp += 1;
                else if (list[k] == 'H') temp += 2;
            }

            max = Math.max(max, temp);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}