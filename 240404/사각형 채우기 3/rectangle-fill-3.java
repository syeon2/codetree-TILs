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
        visited = new boolean[N + 1];
        
        dp(N);

        System.out.print(ans[N]);
    }

    public static long dp(int n) {
        if (visited[n]) return ans[n];

        visited[n] = true;

        if (n == 0) ans[n] = 1;
        else if (n == 1) ans[n] = 2;
        else if (n == 2) ans[n] = 7;
        else {
            ans[n] = ((2 * dp(n - 1)) + (3 * dp(n - 2))) % MOD;
            
            for (int i = 0; i <= n - 3; i++) {
                ans[n] = (ans[n] + (2 * dp(i))) % MOD;
            }
        }

        return ans[n];
    }
}