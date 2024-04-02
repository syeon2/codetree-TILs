import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] isVisit;
    public static List<Pos> list = new ArrayList<>();

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        recur(0);

        System.out.print(ans);
    }

    public static void check() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = list.get(i).x;
            int y = list.get(i).y;

            sum += board[y][x];

            for (int k = 0; k < N; k++) {
                if (k == x) continue;

                if (isVisit[y][k]) return;
            }

            for (int k = 0; k < N; k++) {
                if (k == y) continue;

                if (isVisit[k][x]) return;
            }
        }

        ans = Math.max(ans, sum);
    }

    public static void recur(int depth) {
        if (depth == N) {
            check();
            return;
        }

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (isVisit[y][x]) continue;
                isVisit[y][x] = true;
                list.add(new Pos(x, y));
                recur(depth + 1);
                list.remove(list.size() - 1);
                isVisit[y][x] = false;
            }
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