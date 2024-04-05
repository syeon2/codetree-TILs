import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        int[] memo = new int[M + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {
            
            for (int k = 0; k <= M; k++) {
                if (k >= coin[i] && memo[k - coin[i]] != -1) {
                    memo[k] = Math.max(memo[k], memo[k - coin[i]] + 1);
                }
            }
        }

        System.out.print(memo[M]);
    }
}