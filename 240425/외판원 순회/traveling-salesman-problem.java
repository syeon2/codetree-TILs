import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static int[] memo;
    public static boolean[] visited;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new int[N];
        visited = new boolean[N];

        visited[0] = true;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        perm(1);

        System.out.print(ans);
    }

    public static void check() {
        int dist = board[0][memo[0]];

        for (int i = 1; i < N; i++) {
            int d = board[memo[i - 1]][memo[i]];

            if (d == 0) return;

            dist += d;
        }

        dist += board[memo[N - 1]][0];

        ans = Math.min(ans, dist);
    }

    public static void perm(int depth) {
        if (depth == N) {
            check();
            return;
        }

        for (int i = 1; i < N; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            memo[depth] = i;
            perm(depth + 1);
            visited[i] = false;
        }
    }
}