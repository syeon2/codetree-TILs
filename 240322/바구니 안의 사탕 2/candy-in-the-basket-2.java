import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[101];

        for (int n = 0; n < N; n++) {
            int candy = sc.nextInt();
            int pos = sc.nextInt();

            list[pos] += candy;
        }

        int ans = 0;
        for (int i = 0; i < 101; i++) {
            int temp = 0;

            int start = Math.max(0, i - K);
            int end = Math.min(100, i + K);

            for (int k = start; k <= end; k++) {
                temp += list[k];
            }

            if (ans < temp) ans = temp;
        }

        System.out.print(ans);
    }
}