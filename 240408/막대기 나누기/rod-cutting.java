import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] memo = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            memo[i] = arr[i];
        }

        for (int i = 1; i <= N; i++) {
            int value = arr[i];

            for (int k = 1; k <= N; k++) {
                if (k - i >= 0) memo[k] = Math.max(memo[k], memo[k - i] + value);
            }
        }

        System.out.print(memo[N]);
    }
}