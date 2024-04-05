import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int[] memo = new int[M + 1];
        Arrays.fill(memo, 10001);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {

            for (int k = M; k >= 0; k--) {
                if (k >= list[i]) {
                    memo[k] = Math.min(memo[k], memo[k - list[i]] + 1);
                }
            }
        }

        if (memo[M] == 10001) System.out.print(-1);
        else System.out.print(memo[M]);
    }
}