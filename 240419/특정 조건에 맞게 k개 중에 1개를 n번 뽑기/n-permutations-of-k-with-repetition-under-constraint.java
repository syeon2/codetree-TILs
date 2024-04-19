import java.util.*;

public class Main {

    public static int K;
    public static int N;

    public static int[] memo;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        memo = new int[N];

        perm(0);

        System.out.print(sb);
    }

    public static void perm(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(memo[i]).append(" ");
            }

            sb.append("\n");

            return;
        }

        for (int i = 1; i <= K; i++) {
            if (i < 3) {
                memo[depth] = i;
                perm(depth + 1);
            } else {
                if (memo[i - 2] == memo[i - 1] && memo[i - 1] == i) continue;
                else {
                    memo[depth] = i;
                    perm(depth + 1);
                }
            }
        }
    }
}