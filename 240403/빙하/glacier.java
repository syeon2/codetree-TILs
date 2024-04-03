import java.util.*;

public class Main {
    
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int N;
    public static int M;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        boolean isChanged = false;
        int sec = 0;
        int ans = 0;

        do {
            isChanged = false;
            boolean[][] isVisit = new boolean[N][M];

            Queue<Pair> que = new LinkedList<>();
            que.add(new Pair(0, 0));
            isVisit[0][0] = true;

            int melt = 0;

            while (!que.isEmpty()) {
                Pair node = que.remove();

                int x = node.x;
                int y = node.y;

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (isRange(nx, ny) && board[ny][nx] == 0 && !isVisit[ny][nx]) {
                        isVisit[ny][nx] = true;
                        que.add(new Pair(nx, ny));
                    } else if (isRange(nx, ny) && board[ny][nx] == 1 && !isVisit[ny][nx]) {
                        isVisit[ny][nx] = true;
                        melt++;
                        isChanged = true;
                    }
                }
            }

            if (isChanged) {
                ans = melt;
                sec++;

                for (int i = 0; i < N ; i++) {
                    for (int k = 0; k < M; k++) {
                        if (isVisit[i][k]) board[i][k] = 0;
                    }
                }
            }
        } while (isChanged);

        System.out.printf("%d %d", sec, ans);
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < M && y >= 0 && y < N) return true;

        return false;
    }
}