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

        int ans = -1;

        for (int i = 0; i < N - K; i++) {

            int start = Math.max(0, i - K);
            int end = Math.min(N - 1, i + K);

            int bomb = list[i];

            for (int k = start; k <= end; k++) {
                if (i == k) continue;

                if (list[k] == bomb) ans = Math.max(ans, bomb);
            }
        }

        System.out.print(ans);
    }
}