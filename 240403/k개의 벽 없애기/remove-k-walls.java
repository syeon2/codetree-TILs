import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int K;
    public static int[][] board;
    
    public static Pair[] removeWalls;
    public static List<Pair> walls = new ArrayList<>();

    public static int ans = -1;

    public static int[] startPos = new int[2];
    public static int[] endPos = new int[2];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        board = new int[N][N];
        removeWalls = new Pair[K];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();

                if (board[i][k] == 1) walls.add(new Pair(k, i, 0));
            }
        }

        startPos[1] = sc.nextInt() - 1;
        startPos[0] = sc.nextInt() - 1;

        endPos[1] = sc.nextInt() - 1;
        endPos[0] = sc.nextInt() - 1;

        recur(0, 0);

        System.out.print(ans);
    }

    public static void bfs() {
        int[][] newBoard = new int[N][N];
        boolean[][] isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                newBoard[i][k] = board[i][k];
            }
        }

        for (int i = 0; i < removeWalls.length; i++) {
            Pair wall = removeWalls[i];

            newBoard[wall.y][wall.x] = 0;
        }

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(startPos[0], startPos[1], 0));
        isVisit[startPos[1]][startPos[0]] = true;

        while (!que.isEmpty()) {
            Pair node = que.remove();

            int x = node.x;
            int y = node.y;
            int v = node.v;

            if (x == endPos[0] && y == endPos[1]) {
                if (ans == -1) ans = v;
                else ans = Math.min(ans, v);

                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny) && !isVisit[ny][nx] && newBoard[ny][nx] == 0) {
                    isVisit[ny][nx] = true;
                    que.add(new Pair(nx, ny, v + 1));
                }
            }
        }
    }

    public static void recur(int idx, int depth) {
        if (depth == K) {
            bfs();
            return;
        }

        for (int i = idx; i < walls.size(); i++) {
            recur(idx + 1, depth);
            removeWalls[depth] = walls.get(i);
            recur(idx + 1, depth + 1);
        }
    }

    public static class Pair {
        public int x;
        public int y;
        public int v;

        public Pair(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}