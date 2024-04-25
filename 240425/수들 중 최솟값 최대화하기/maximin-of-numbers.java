import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static int[] memo;
    public static boolean[] visited;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new int[N];
        visited = new boolean[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        perm(0);

        System.out.print(ans);
    }

    public static void getMinValue() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            min = Math.min(min, board[i][memo[i]]);
        }

        ans = Math.max(ans, min);
    }

    public static void perm(int depth) {
        if (depth == N) {
            getMinValue();

            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            memo[depth] = i;
            perm(depth + 1);
            visited[i] = false;
        }
    }
}