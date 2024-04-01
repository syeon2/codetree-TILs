import java.util.*;

public class Main {

    public static int N;
    public static int K;
    public static int M;

    public static int[] move;
    public static int[] pieces;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        move = new int[N];
        pieces = new int[K];
        for (int i = 0; i < N; i++) {
            move[i] = sc.nextInt();
        }

        permutation(0);

        System.out.print(ans);
    }

    public static void check() {
        int cnt = 0;
        for (int i = 0; i < K; i++) {
            if (pieces[i] >= (M - 1)) cnt++;
        }

        ans = Math.max(ans, cnt);
    }

    public static void permutation(int idx) {
        if (idx == N) {
            check();
            return;
        }

        for (int i = 0; i < K; i++) {
            pieces[i] += move[idx];
            permutation(idx + 1);
            pieces[i] -= move[idx];
        }
    }
}