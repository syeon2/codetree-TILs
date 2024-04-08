import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int[] memo = new int[N];
        memo[0] = list[0];

        for (int i = 1; i < N; i++) {
            if (memo[i - 1] + list[i] < 0) memo[i] = list[i];
            else memo[i]  = memo[i - 1] + list[i];
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }
}