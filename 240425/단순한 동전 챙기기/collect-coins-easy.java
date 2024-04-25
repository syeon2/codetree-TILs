import java.util.*;

public class Main {

    public static int N;
    public static List<Pair> list = new ArrayList<>();
    public static List<Pair> memo = new ArrayList<>();

    public static Pair startPos;
    public static Pair endPos;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int r = 0; r < N; r++) {
            char[] cList = sc.next().toCharArray();

            for (int c = 0; c < N; c++) {
                if (cList[c] >= '0' && cList[c] <= '9') {
                    list.add(new Pair(c, r, cList[c] - '0'));
                } else if (cList[c] == 'S') startPos = new Pair(c, r, cList[c] - '0');
                else if (cList[c] == 'E') endPos = new Pair(c, r, cList[c] - '0');
            }
        }

        list.sort((a, b) -> {
            return a.value - b.value;
        });

        perm(0, 0);

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }

    public static int getDist(Pair node1, Pair node2) {
        return Math.abs(node1.x - node2.x) + Math.abs(node1.y - node2.y);
    }

    public static void getMinDist() {
        int dist = getDist(startPos, memo.get(0));

        for (int i = 1; i < 3; i++) {
            dist += getDist(memo.get(i - 1), memo.get(i));
        }

        dist += getDist(endPos, memo.get(2));

        ans = Math.min(ans, dist);
    }

    public static void perm(int idx, int depth) {
        if (depth == 3) {
            getMinDist();
            return;
        }

        if (idx == list.size()) return;

        memo.add(list.get(idx));
        perm(idx + 1, depth + 1);
        memo.remove(memo.size() - 1);
        perm(idx + 1, depth);
    }

    public static class Pair {
        public int x;
        public int y;
        public int value;

        public Pair(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}