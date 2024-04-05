import java.util.*;

public class Main {

    public static int N;
    public static int[] list;
    public static int[] memo;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N];
        memo = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, dp(i));
        }

        System.out.print(ans);
    }

    public static int dp(int n) {
        if (memo[n] != 0) return memo[n];

        if (n == 0) memo[n] = 1;
        else {
            int max = 0;

            for (int i = 0; i < n; i++) {
                if (list[i] < list[n]) {
                    int cnt = dp(i);

                    max = Math.max(max, cnt);
                }
            }

            memo[n] = max + 1;
        }

        return memo[n];
    }
}