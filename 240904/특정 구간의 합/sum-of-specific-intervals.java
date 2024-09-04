import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        list = br.readLine().split(" ");

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(list[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            list = br.readLine().split(" ");

            int a1 = Integer.parseInt(list[0]);
            int a2 = Integer.parseInt(list[1]);

            int sum = getSum(A, a1, a2);

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int getSum(int[] list, int a, int b) {
        int sum = 0;

        for (int i = a - 1; i < b; i++) {
            sum += list[i];
        }

        return sum;
    }
}