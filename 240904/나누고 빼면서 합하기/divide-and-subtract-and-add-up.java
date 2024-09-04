import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        int[] A = new int[n];
        list = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(list[i]);
        }

        int ans = sum(A, m);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int sum(int[] list, int m) {
        int sum = 0;

        while (true) {
            sum += list[m - 1];

            if (m == 1) break;

            if (m % 2 == 0) m /= 2;
            else m -= 1;
        }

        return sum;
    }
}