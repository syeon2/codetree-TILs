import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int cnt = getGoldCnt(c, r);

                ans = Math.max(ans, cnt);
            }
        }

        System.out.print(ans);
    }

    public static int getGoldCnt(int x, int y) {
        int maxCnt = 0;

        for (int i = 0; i <= N; i++) {
            int K = i;

            int cost = (K * K) + ((K + 1) * (K + 1));
            int cnt = 0;

            for (int k = 0; k <= K; k++) {
                if (k == 0) {
                    for (int j = x - K; j <= x + K; j++) {
                        if (isRange(j, y)) cnt += board[y][j];
                    }
                } else {
                    int y1 = y - k;
                    int y2 = y + k;

                    for (int j = x - (K - k); j <= x + (K - k); j++) {
                        if (isRange(j, y1)) cnt += board[y1][j];
                        if (isRange(j, y2)) cnt += board[y2][j];
                    }
                }
            }

            if ((cnt * M) >= cost) maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
    }

    public static boolean isRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}