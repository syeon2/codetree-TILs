import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int M = 0;

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            M += list[i];
        }

        int[] memo = new int[M + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {
            int value = list[i];

            for (int k = M; k >= 0; k--) {
                if (k == value && memo[k] == -1) memo[k] = Math.max(memo[k], value);
                else if (k >= value && memo[k - value] != -1) {
                    memo[k] = Math.max(memo[k], memo[k - value] + value);
                }
            }
        }

        int ans = 0;

        for (int i = 0; i <= M; i++) {
            if (memo[i] != -1) {
                int a = memo[i];

                if ((M - a) % 2 == 0) {
                    if (memo[(M - a) / 2] != -1) ans = Math.max(ans, memo[(M - a) / 2]);
                }
            }
        }

        System.out.print(ans);
    }
}