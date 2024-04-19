import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static Pair[] list;
    public static boolean[] used;

    public static int[] compAns;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        compAns = new int[N];
        
        list = new Pair[M];
        used = new boolean[M];

        for (int m = 0; m < M; m++) {
            int start = sc.nextInt() - 1;
            int order = sc.nextInt();

            list[m] = new Pair(start, order);
        }

        initAnswer();

        perm(0);

        System.out.print(ans);
    }

    public static void compareAns() {
        int[] tempList = new int[N];

        for (int i = 0; i < N; i++) {
            int temp = i;

            for (int k = 0; k < M; k++) {
                if (!used[k]) continue;

                int start = list[k].start;
                int end = start + 1;

                if (temp == start) temp = end;
                else if (temp == end) temp = start;
            }

            tempList[i] = temp;
        }

        for (int i = 0; i < N; i++) {
            if (compAns[i] != tempList[i]) return;
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (used[i]) cnt++;
        }

        ans = Math.min(ans, cnt);
    }

    public static void perm(int depth) {
        if (depth == M) {
            compareAns();

            return;
        }

        used[depth] = true;
        perm(depth + 1);
        used[depth] = false;
        perm(depth + 1);
    }

    public static void initAnswer() {
        Arrays.sort(list, (a, b) -> {
            return a.order - b.order;
        });

        for (int i = 0; i < N; i++) {
            int temp = i;

            for (int k = 0; k < M; k++) {
                int start = list[k].start;
                int end = list[k].start + 1;

                if (start == temp) temp = end;
                else if (end == temp) temp = start;
            }

            compAns[i] = temp;
        }
    }

    public static class Pair {
        public int start;
        public int order;

        public Pair(int start, int order) {
            this.start = start;
            this.order = order;
        }
    }
}