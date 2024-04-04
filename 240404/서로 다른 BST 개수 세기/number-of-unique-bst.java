import java.util.*;

public class Main {
    
    public static int N;
    public static int[] ans;
    public static boolean[] visited;

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

        if (n <= 2) ans[n] = n;
        else {
            for (int i = 0; i < n - 1; i++) {
                ans[n] += dp(i) + dp(n - i - 1);
            }
        }

        return ans[n];
    }
}