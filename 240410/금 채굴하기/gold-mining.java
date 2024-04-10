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

                for (int k = 0; k <= N; k++) {
                    int cnt = getGoldCnt(c, r, k);

                    if ((cnt * M) >= getCost(k)) ans = Math.max(ans, cnt);
                }
            }
        }

        System.out.print(ans);
    }

    public static int getGoldCnt(int x, int y, int k) {
        int cnt = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (Math.abs(x - c) + Math.abs(y - r) <= k) cnt += board[r][c];
            }
        }

        return cnt;
    }

    public static int getCost(int k) {
        return ((k * k) + ((k + 1) * (k + 1)));
    }
}