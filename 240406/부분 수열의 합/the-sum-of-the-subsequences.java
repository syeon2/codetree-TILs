import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] el = new int[N];
        for (int i = 0; i < N; i++) {
            el[i] = sc.nextInt();
        }

        int[] memo = new int[M + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        for (int i = 0; i < N; i++) {

            for (int k = M; k >= 0; k--) {
                if (k >= el[i] && memo[k - el[i]] != -1) {
                    memo[k] = Math.max(memo[k], memo[k - el[i]] + 1);
                }
            }
        }

        if (memo[M] == -1) System.out.print("No");
        else System.out.print("Yes");
    }
}