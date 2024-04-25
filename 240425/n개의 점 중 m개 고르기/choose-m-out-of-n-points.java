import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static Pair[] list;
    public static Pair[] memo;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new Pair[N];
        memo = new Pair[M];

        for (int n = 0; n < N; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[n] = new Pair(x, y);
        }

        perm(0, 0);

        System.out.print(ans);
    }

    public static void getMinDist() {
        int maxDist = 0;

        for (int i = 0; i < M; i++) {
            Pair first = memo[i];

            for (int k = 0; k < M; k++) {
                if (i == k) continue;

                Pair second = memo[k];

                int width = first.x - second.x;
                int height = first.y - second.y;

                int dist = (width * width) + (height * height);

                maxDist = Math.max(maxDist, dist);
            }
        }

        ans = Math.min(ans, maxDist);
    }

    public static void perm(int idx, int depth) {
        if (depth == M) {
            getMinDist();

            return;
        }

        if (idx == N) return;

        perm(idx + 1, depth);
        memo[depth] = list[idx];
        perm(idx + 1, depth + 1);
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}