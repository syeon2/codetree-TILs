import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        int[][] memo = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(memo[i], Integer.MIN_VALUE);
        }
        memo[0][0] = 0;
        
        for (int i = 1; i <= N; i++) {
            int value = list[i];

            for (int k = 0; k <= K; k++) {
                if (value >= 0) memo[i][k] = Math.max(value, memo[i - 1][k] + value);
                else {
                    if (k == 0) memo[i][k] = value;
                    else memo[i][k] = memo[i - 1][k - 1] + value;
                }
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i <= N; i++) {
            for (int k = 0; k <= K; k++) {
                ans = Math.max(ans, memo[i][k]);
            }
        }

        System.out.print(ans);
    }
}