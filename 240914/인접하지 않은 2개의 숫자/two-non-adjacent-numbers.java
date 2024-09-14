import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(str[i]);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 2; k < N; k++) {
                max = Math.max(max, list[i] + list[k]);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}