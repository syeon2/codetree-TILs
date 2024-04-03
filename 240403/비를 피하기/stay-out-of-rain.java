import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int H;
    public static int M;
    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        H = sc.nextInt();
        M = sc.nextInt();
        
        board = new int[N][N];

        Queue<Pair> people = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();

                if (board[i][k] == 2) people.add(new Pair(k, i, 0));
            }
        }

        int[][] ansBoard = new int[N][N];

        while (!people.isEmpty()) {
            boolean[][] isVisit = new boolean[N][N];
            Pair p = people.remove();

            int x = p.x;
            int y = p.y;

            int ans = -1;

            Queue<Pair> que = new LinkedList<>();
            que.add(p);
            isVisit[y][x] = true;
            

            while (!que.isEmpty()) {
                Pair node = que.remove();

                int cx = node.x;
                int cy = node.y;

                if (board[cy][cx] == 3) {
                    ans = node.v;
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if (isRange(nx, ny, N) && board[ny][nx] != 1 && !isVisit[ny][nx]) {
                        isVisit[ny][nx] = true;
                        que.add(new Pair(nx, ny, node.v + 1));
                    }
                }
            }

            ansBoard[y][x] = ans;
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.printf("%d ", ansBoard[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
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
}