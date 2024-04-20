import java.util.*;

public class Main {

    public static int N;
    public static int[] move;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        move = new int[N];
        for (int n = 0; n < N; n++) {
            move[n] = sc.nextInt();
        }

        perm(0, 0);

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }

    public static void perm(int idx, int cnt) {
        if (idx >= N - 1) {
            ans = Math.min(ans, cnt);

            return;
        }

        int step = move[idx];

        for (int i = 1; i <= step; i++) {
            perm(idx + i, cnt + 1);
        }
    }
}