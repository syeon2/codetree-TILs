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
        else ans[n] = (dp(n - 1) + dp(n - 2)) % 10007;

        return ans[n];
    }
}