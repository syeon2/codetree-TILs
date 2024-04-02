import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;

    public static boolean[] memo;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new boolean[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        permutation(0, 0);

        System.out.print(ans);
    }

    public static void permutation(int row, int sum) {
        if (row == N) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (memo[col]) continue;
            memo[col] = true;

            permutation(row + 1, sum + board[col][row]);

            memo[col] = false;
        }
    }
}