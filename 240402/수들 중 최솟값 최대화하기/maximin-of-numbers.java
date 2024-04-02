import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[] memo;

    public static int[] ansList;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        memo = new boolean[N];
        ansList = new int[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        permutation(0);

        System.out.print(ans);
    }

    public static void check() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (ansList[i] < min) min = ansList[i];
        }

        ans = Math.max(ans, min);
    }

    public static void permutation(int row) {
        if (row == N) {
            check();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (memo[i]) continue;
            memo[i] = true;
            ansList[row] = board[i][row];
            permutation(row + 1);
            memo[i] = false;
        }
    }
}