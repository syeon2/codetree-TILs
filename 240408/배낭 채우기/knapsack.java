import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();

            arr[i][0] = w;
            arr[i][1] = v;
        }

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

        int[] memo = new int[M + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {

            int targetWeight = arr[i][0];
            int targetValue = arr[i][1];

            for (int k = M; k >= 0; k--) {
                if (k >= targetWeight && memo[k - targetWeight] != -1) {
                    memo[k] = Math.max(memo[k], memo[k - targetWeight] + targetValue);
                } else if (k == targetWeight) {
                    memo[k] = Math.max(targetValue, memo[k]);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= M; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }
}