import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int T;
    public static int N;
    public static List<Bead> list = new ArrayList<>();

    public static int ans = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        T = sc.nextInt();

        while (T-- > 0) {
            init(sc);

            int time = 1;
            while (!list.isEmpty()) {
                simulate(time++);
                simulate(time++);
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }

    public static void simulate(int time) {
        Map<String, Bead> board = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Bead bead = list.get(i);

            int curDirec = bead.direc;

            int nx = bead.x + dx[curDirec];
            int ny = bead.y + dy[curDirec];
            bead.x = nx;
            bead.y = ny;

            if (!isRange(nx, ny)) continue;

            String key = getKey(nx, ny);

            if (board.containsKey(key)) {
                Bead comp = board.get(key);

                if (comp.weight < bead.weight || (comp.weight == bead.weight && comp.order < bead.order)) {
                    board.replace(key, bead);
                }

                ans = time;
            } else board.put(key, bead);
        }

        list = new ArrayList<>(board.values());
    }

    public static String getKey(int x, int y) {
        return x + "," + y;
    }

    public static boolean isRange(int x, int y) {
        if (x >= -2000 && x <= 2000 && y >= -2000 && y <= 2000) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'R') return 0;
        else if (direc == 'D') return 3;
        else if (direc == 'L') return 2;
        else return 1;
    }

    public static void init(Scanner sc) {
        ans = -1;
        N = sc.nextInt();
        list = new ArrayList<>();

        for (int n = 0; n < N; n++) {
            int c = sc.nextInt() * 2;
            int r = sc.nextInt() * 2;
            int weight = sc.nextInt();
            int direc = getDirec(sc.next().charAt(0));

            list.add(new Bead(c, r, direc, weight, n));
        }
    }

    public static class Bead {
        public int x;
        public int y;
        public int direc;
        public int weight;
        public int order;

        public Bead(int x, int y, int direc, int weight, int order) {
            this.x = x;
            this.y = y;
            this.direc = direc;
            this.weight = weight;
            this.order = order;
        }
    }
}