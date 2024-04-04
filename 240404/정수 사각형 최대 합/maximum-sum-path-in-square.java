import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] visited;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = dp(N - 1, N - 1);

        System.out.print(ans);
    }

    public static int dp(int x, int y) {
        if (!isRange(x, y)) return 0;
        if (visited[y][x]) return board[y][x];
        visited[y][x] = true;

        if (x == 0 && y == 0) return board[0][0];
        else {
            int max = Math.max(dp(x - 1, y), dp(x, y - 1));

            board[y][x] += max;

            return board[y][x];
        }

    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}