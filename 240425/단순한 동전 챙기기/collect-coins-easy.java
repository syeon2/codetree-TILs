import java.util.*;

public class Main {

    public static int N;
    public static List<Pair> list = new ArrayList<>();

    public static int[] memo = new int[3];

    public static int[] start = new int[2];
    public static int[] end = new int[2];

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
                } else if (cList[c] == 'S') {
                    start[0] = c;
                    start[1] = r;
                } else if (cList[c] == 'E') {
                    end[0] = c;
                    end[1] = r;
                }
            }
        }

        perm(0);

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }

    public static void getMinDist() {
        int dist = 0;

        int curX = start[0];
        int curY = start[1];
        int value = 0;

        for (int i = 0; i < 3; i++) {
            Pair node = list.get(memo[i]);

            if (node.value <= value) return;

            dist += Math.abs(curX - node.x) + Math.abs(curY - node.y);

            curX = node.x;
            curY = node.y;
            value = node.value;
        }

        dist += Math.abs(curX - end[0]) + Math.abs(curY - end[1]);

        ans = Math.min(ans, dist);
    }

    public static void perm(int depth) {
        if (depth == 3) {
            getMinDist();

            return;
        }

        for (int i = 0; i < list.size(); i++) {
            memo[depth] = i;
            perm(depth + 1);
        }
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