import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < M; x1++) {

                for (int y2 = y1; y2 < N; y2++) {
                    for (int x2 = x1; x2 < M; x2++) {

                        int cnt = 0;
                        boolean isNatual = true;

                        for (int i = y1; i <= y2; i++) {
                            for (int k = x1; k <= x2; k++) {
                                cnt++;
                                if (board[i][k] <= 0) isNatual = false;
                            }
                        }

                        if (isNatual) ans = Math.max(ans, cnt);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}