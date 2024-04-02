import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] isVisit;

    public static int[][] ansList;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        isVisit = new boolean[N][N];
        ansList = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        permutation(0);

        System.out.print(ans);
    }

    public static void check() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x1 = ansList[i][0];
            int y1 = ansList[i][1];

            sum += board[y1][x1];

            for (int k = i + 1; k < N; k++) {
                int x2 = ansList[k][0];
                int y2 = ansList[k][1];

                if (x1 == x2 || y1 == y2) return;
            }
        }

        ans = Math.max(ans, sum);
    }

    public static void permutation(int depth) {
        if (depth == N) {
            check();
            return;
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (isVisit[r][c]) continue;
                isVisit[r][c] = true;
                ansList[depth][0] = c;
                ansList[depth][1] = r;
                permutation(depth + 1);
                isVisit[r][c] = false;
            }
        }
    }
}