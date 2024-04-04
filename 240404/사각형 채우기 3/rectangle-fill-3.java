import java.util.*;

public class Main {

    public static int N;
    public static long[] ans;
    public static boolean[] visited;

    public static long MOD = 1000000007;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        ans = new long[N + 1];
        ans[1] = 2;
        if (N >= 2) ans[2] = 7;
        if (N >= 3) ans[3] = 22;

        for (int i = 4; i <= N; i++) {
            ans[i] = (((2 * ans[i - 1]) % MOD) + ((3 * ans[i - 2]) % MOD)) % MOD;
        }

        System.out.print(ans[N]);
    }
}