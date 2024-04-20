import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[] memo;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        memo = new int[N];

        perm(1, 0);

        System.out.print(sb);
    }

    public static void perm(int idx, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(memo[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = idx; i <= N; i++) {
            memo[depth] = i;
            perm(i + 1, depth + 1);
        }
    }
}