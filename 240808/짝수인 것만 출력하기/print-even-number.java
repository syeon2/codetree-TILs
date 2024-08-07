import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");
        int[] ansList = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(list[i]);

            if (num % 2 == 0) {
                ansList[cnt++] = num;
            }
        }

        for (int i = 0; i < cnt; i++) {
            bw.write(String.format("%d ", ansList[i]));
        }

        bw.flush();
        bw.close();
    }
}