import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int K;
    public static int M;

    public static int[][] board;

    public static int ans = 0;

    public static List<Pair> start = new ArrayList<>();
    public static List<Pair> stoneList = new ArrayList<>();
    public static Pair[] removeStoneList;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][N];
        removeStoneList = new Pair[M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();

                if (board[i][k] == 1) stoneList.add(new Pair(k, i));
            }
        }

        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            start.add(new Pair(c, r));
        }

        recur(0, 0);

        System.out.print(ans);
    }

    public static void bfs() {

        int[][] newBoard = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                newBoard[i][k] = board[i][k];
            }
        }

        for (int i = 0; i < M; i++) {
            Pair node = removeStoneList[i];

            int x = node.x;
            int y = node.y;

            newBoard[y][x] = 0;
        }

        boolean[][] isVisit = new boolean[N][N];
        Queue<Pair> que = new LinkedList<>();

        for (int i = 0; i < start.size(); i++) {
            Pair node = start.get(i);
            que.add(node);
            isVisit[node.y][node.x] = true;
        }

        int cnt = que.size();

        while (!que.isEmpty()) {
            Pair pop = que.remove();

            int x = pop.x;
            int y = pop.y;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (isRange(nx, ny) && newBoard[ny][nx] == 0 && !isVisit[ny][nx]) {
                    isVisit[ny][nx] = true;
                    cnt++;
                    que.add(new Pair(nx, ny));
                }
            }
        }

        ans = Math.max(ans, cnt);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static void recur(int idx, int depth) {
        if (depth == M) {
            bfs();
            return;
        }

        for (int i = idx; i < stoneList.size(); i++) {
            removeStoneList[depth] = stoneList.get(i);
            recur(i + 1, depth + 1);
        }
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