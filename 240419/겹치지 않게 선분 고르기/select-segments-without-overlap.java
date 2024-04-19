import java.util.*;

public class Main {

    public static int N;
    public static Pair[] list;
    public static boolean[] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new Pair[N];
        memo = new boolean[N];

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            list[i] = new Pair(start, end);
        }

        Arrays.sort(list, (a, b) -> {
            if (a.start == b.start) {
                return b.end - a.end;
            }

            return a.start - b.start;
        });

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == N) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (memo[i]) cnt++;
            }

            ans = Math.max(ans, cnt);
            return;
        }

        if (depth == 0) {
            memo[depth] = true;
            perm(depth + 1);
            memo[depth] = false;
        } else {
            int idx = 0;
            for (int i = depth - 1; i >= 0; i--) {
                if (memo[i]) {
                    idx = i;
                    break;
                }
            }

            if (list[idx].end < list[depth].start) {
                memo[depth] = true;
                perm(depth + 1);
                memo[depth] = false;
            } else perm(depth + 1);
        }
    }

    public static class Pair {
        public int start;
        public int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}