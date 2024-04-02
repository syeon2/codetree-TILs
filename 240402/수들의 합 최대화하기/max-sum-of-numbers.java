import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[] isVisit;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        permutation(0, 0);

        System.out.print(ans);
    }

    public static void permutation(int sum, int x) {
        if (x == N) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int y = 0; y < N; y++) {
            if (isVisit[y]) continue;
            isVisit[y] = true;

            permutation(sum + board[y][x], x + 1);

            isVisit[y] = false;
        }
    }
}