import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= 10000; i++) {
            int totalCost = 0;

            for (int k = 0; k < N; k++) {
                int num = list[k];

                if (i <= num && num <= i + K) continue;
                else if (num < i) totalCost += (i - num);
                else if (num > (i + K)) totalCost += (num - (i + K));
            }

            ans = Math.min(ans, totalCost);
        }

        System.out.print(ans);
    }
}