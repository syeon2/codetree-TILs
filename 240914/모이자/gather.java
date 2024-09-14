import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(strs[i]);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int temp = 0;

            for (int k = 0; k < N; k++) {
                int dist = Math.abs(i - k);
                int people = list[k];

                temp += dist * people;
            }

            min = Math.min(min, temp);
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}