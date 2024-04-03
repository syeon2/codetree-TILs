import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int K;
    public static int U;
    public static int D;

    public static int[][] board;
    public static boolean[][] isVisit;

    public static Pair[] cities;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        U = sc.nextInt();
        D = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];
        cities = new Pair[K];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        recur(0);

        System.out.print(ans);
    }

    public static void bfs() {
        int cnt = 0;

        boolean[][] temp = new boolean[N][N];

        for (int i = 0; i < K; i++) {
            Pair startNode = cities[i];
            cnt++;

            Queue<Pair> que = new LinkedList<>();
            que.add(startNode);
            temp[startNode.y][startNode.x] = true;

            while (!que.isEmpty()) {
                Pair node = que.remove();

                int x = node.x;
                int y = node.y;
                int value = board[y][x];

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (isRange(nx, ny) && !temp[ny][nx]) {
                        int nValue = board[ny][nx];

                        int sub = Math.abs(value - nValue);
                        if (sub >= U && sub <= D) {
                            temp[ny][nx] = true;
                            que.add(new Pair(nx, ny));
                            cnt++;
                        }
                    }
                }
            }
        }

        ans = Math.max(ans, cnt);
    }

    public static void recur(int depth) {
        if (depth == K) {
            bfs();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (isVisit[i][k]) continue;

                isVisit[i][k] = true;
                cities[depth] = new Pair(k, i);
                recur(depth + 1);
                isVisit[i][k] = false;
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
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