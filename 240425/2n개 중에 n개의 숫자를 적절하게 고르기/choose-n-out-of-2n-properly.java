import java.util.*;

public class Main {

    public static int N;
    public static int[] list;
    public static int[] memo;

    public static int total = 0;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        list = new int[N * 2];
        memo = new int[N];

        for (int n = 0; n < 2 * N; n++) {
            list[n] = sc.nextInt();
            total += list[n];
        }

        perm(0, 0);

        System.out.print(ans);
    }

    public static void getMinSub() {
        int one = 0;
        int another = 0;

        for (int i = 0; i < N; i++) {
            one += memo[i];
        }

        another = total - one;

        ans = Math.min(ans, Math.abs(one - another));
    }

    public static void perm(int idx, int depth) {
        if (depth == N) {
            getMinSub();

            return;
        }

        if (idx == 2 * N) return;

        perm(idx + 1, depth);
        memo[depth] = list[idx];
        perm(idx + 1, depth + 1);
    }
}