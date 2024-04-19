import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int K;

    public static int[] list;
    public static int[] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        list = new int[N];
        memo = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == N) {
            renewAns();

            return;
        }

        for (int i = 1; i <= K; i++) {
            memo[depth] = i;
            perm(depth + 1);
        }
    }

    public static void renewAns() {
        int[] temp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            int pinIdx = memo[i];

            temp[pinIdx] += list[i];
        }

        int score = 0;
        for (int i = 1; i <= K; i++) {
            if (temp[i] >= M) score++;
        }

        ans = Math.max(ans, score);
    }
}