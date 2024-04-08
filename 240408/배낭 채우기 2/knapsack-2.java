import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] jewels = new int[N][2];
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();

            jewels[i][0] = w;
            jewels[i][1] = v;
        }

        int[] memo = new int[M + 1];
        memo[0] = 0;

        for (int i = 0; i < N; i++) {
            int targetWeight = jewels[i][0];
            int targetValue = jewels[i][1];

            for (int k = 1; k <= M; k++) {
                if (k - targetWeight >= 0) {
                    if (k % targetWeight == 0) {
                        memo[k] = Math.max(memo[k],
                                Math.max(targetValue * (k / targetWeight),
                                        targetValue + memo[k - targetWeight])
                        );
                    } else {
                        memo[k] = Math.max(memo[k], targetValue + memo[k - targetWeight]);
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= M; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }
}