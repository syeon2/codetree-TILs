import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int total = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int[] memo = new int[total + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {
            int value = arr[i];

            for (int k = memo.length - 1; k >= 0; k--) {
                if (k == value && memo[k - value] == -1) memo[k] = value;
                else if (k - value >= 0 && memo[k - value] != -1) {
                    memo[k] = Math.max(memo[k], memo[k - value] + value);
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= total; i++) {
            int a = total - memo[i];
            int b = memo[i];

            if (b != -1) ans = Math.min(ans, Math.abs(a - b));
        }

        System.out.print(ans);
    }
}