import java.util.*;

public class Main {

    public static int N;
    public static int[][] board;
    public static boolean[][] isVisit;

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

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (isVisit[r][c]) {
                    sum += board[r][c];

                    for (int i = 0; i < N; i++) {
                        if (i == c) continue;

                        if (isVisit[r][i]) return;
                    }

                    for (int i = 0; i < N; i++) {
                        if (i == r) continue;

                        if (isVisit[i][c]) return;
                    }
                }
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
                recur(depth + 1);
                isVisit[y][x] = false;
            }
        }
    }
}