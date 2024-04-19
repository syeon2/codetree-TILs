import java.util.*;

public class Main {

    public static int N;
    public static Pair[] list;

    public static List<Pair> memo = new ArrayList<>();

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new Pair[N];

        for (int n = 0; n < N; n++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            list[n] = new Pair(start, end);
        }

        Arrays.sort(list, (a, b) -> {
            if (a.start == b.start) {
                return a.end - b.end;
            }

            return a.start - b.start;
        });

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == N) {
            ans = Math.max(ans, memo.size());

            return;
        }

        if (memo.isEmpty() || memo.get(memo.size() - 1).end < list[depth].start) {
            memo.add(list[depth]);
            perm(depth + 1);
            memo.remove(memo.size() - 1);
        }

        perm(depth + 1);
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