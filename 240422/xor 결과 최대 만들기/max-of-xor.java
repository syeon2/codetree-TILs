import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[] list;

    public static int[] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N];
        memo = new int[M];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        perm(0, 0);

        System.out.print(ans);
    }

    public static void perm(int idx, int depth) {
        if (depth == M) {
            check();
            return;
        }

        for (int i = idx; i < N; i++) {
            memo[depth] = list[i];
            perm(i + 1, depth + 1);
        }
    }

    public static void check() {
        int temp = memo[0];

        for (int m = 1; m < M; m++) {
            temp ^= memo[m];
        }

        ans = Math.max(ans, temp);
    }
}