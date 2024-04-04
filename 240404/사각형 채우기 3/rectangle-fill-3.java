import java.util.*;

public class Main {

    public static int N;
    public static int[] ans;
    public static boolean[] visited;

    public static int MOD = 1000000007;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        ans = new int[N + 1];
        visited = new boolean[N + 1];
        
        dp(N);

        System.out.print(ans[N]);
    }

    public static int dp(int n) {
        if (visited[n]) return ans[n];

        visited[n] = true;

        if (n == 0) ans[n] = 1;
        else if (n == 1) ans[n] = 2;
        else if (n == 2) ans[n] = 7;
        else {
            ans[n] = (((2 * dp(n - 1)) % MOD) + ((3 * dp(n - 2)) % MOD)) % MOD;
            
            for (int i = 0; i <= n - 3; i++) {
                ans[n] = (((2 * dp(i)) % MOD) + ans[n]) % MOD;
            }
        }

        return ans[n];
    }
}