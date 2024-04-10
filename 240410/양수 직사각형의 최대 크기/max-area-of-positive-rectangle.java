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
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = -1;

        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < N; x1++) {

                for (int y2 = y1; y2 < N; y2++) {
                    for (int x2 = x1; x2 < N; x2++) {

                        int sum = getSum(x1, y1, x2, y2);

                        ans = Math.max(ans, sum);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static int getSum(int x1, int y1, int x2, int y2) {
        int cnt = 0;

        for (int i = y1; i <= y2; i++) {
            for (int k = x1; k <= x2; k++) {
                if (board[i][k] == -1) return -1;

                cnt++;
            }
        }

        return cnt;
    }
}