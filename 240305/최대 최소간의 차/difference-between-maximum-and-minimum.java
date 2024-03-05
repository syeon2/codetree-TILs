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
            int min = i;
            int max = i + K;

            int expense = 0;
            for (int k = 0; k < N; k++) {
                if (list[k] < min) expense += Math.abs(list[k] - i);
                if (list[k] > max) expense += Math.abs(max - list[k]);
            }

            ans = Math.min(ans, expense);
        }

        System.out.print(ans);
    }
}