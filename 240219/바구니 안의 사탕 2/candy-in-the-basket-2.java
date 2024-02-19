import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] line = new int[101];
        for (int n = 0; n < N; n++) {
            int candy = sc.nextInt();
            int pos = sc.nextInt();

            line[pos] += candy;
        }

        int ans = 0;
        for (int c = 0; c <= 100; c++) {
            int start = c - K;

            if (start < 0) start = 0;

            int end = c + K;
            if (c + K > 100) end = 100;

            int temp = 0;
            for (int i = start; i <= end; i++) {
                temp += line[i];
            }

            ans = Math.max(ans, temp);
        }

        System.out.print(ans);
    }
}