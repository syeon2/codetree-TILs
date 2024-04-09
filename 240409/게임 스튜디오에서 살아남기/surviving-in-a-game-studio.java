import java.util.*;

public class Main {

    public static long MOD = 1000000007;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[][] memo = new long[N + 1][5];

        memo[1][0] = 1;
        memo[1][1] = 1;
        memo[1][2] = 1;

        if (N >= 2) {
            memo[2][0] = 2;
            memo[2][1] = 2;
            memo[2][2] = 4;
            memo[2][3] = 1;
        }

        for (int i = 3; i <= N; i++) {
            memo[i][0] = (memo[i - 1][0] + memo[i - 1][1]) % MOD;
            if (memo[i - 1][1] < memo[i - 2][1]) {
                memo[i][1] = (memo[i - 1][0] + ((memo[i - 1][1] * MOD) - memo[i - 2][1]) % MOD) % MOD;
            } else memo[i][1] = (memo[i - 1][0] + (memo[i - 1][1] - memo[i - 2][1])) % MOD;
            memo[i][2] = ((memo[i - 1][0] + memo[i - 1][1]) % MOD + (memo[i - 1][2] * 2) % MOD) % MOD;
            memo[i][3] = ((memo[i - 1][3] * 2) % MOD + memo[i - 1][2]) % MOD;
        }

        long ans = 0;

        for (int i = 0; i < 5; i++) {
            ans = (ans + memo[N][i]) % MOD;
        }

        System.out.print(ans);
    }
}