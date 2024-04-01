import java.util.*;

public class Main {

    public static int[][] dx = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, -1}, {0, 1, 1, -1, -1}};
    public static int[][] dy = {{0, -2, -1, 1, 2}, {0, -1, 0, 1, 0}, {0, -1, 1, 1, -1}};

    public static int[][] memo;
    public static int[][] board;
    public static List<Pos> list = new ArrayList<>();

    public static int N;
    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        memo = new int[N][N];
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();

                if (board[i][k] == 1) list.add(new Pos(k, i));
            }
        }

        permutation(0);

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getSum() {
        int[][] temp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (board[i][k] == 0) continue;

                int block = memo[i][k];

                for (int j = 0; j < 5; j++) {
                    int nx = k + dx[block][j];
                    int ny = i + dy[block][j];

                    if (isRange(nx, ny)) temp[ny][nx] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (temp[i][k] == 1) sum++;
            }
        }

        return sum;
    }

    public static void permutation(int depth) {
        if (depth == list.size()) {
            ans = Math.max(ans, getSum());
            return;
        }

        for (int i = 0; i < 3; i++) {
            int x = list.get(depth).x;
            int y = list.get(depth).y;

            memo[y][x] = i;
            permutation(depth + 1);
            memo[y][x] = 0;
        }
    }

    public static class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}