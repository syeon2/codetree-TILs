import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] board;

    public static int[] seq;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][N];

        seq = new int[N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                seq[k] = board[i][k];
            }

            if (isHappy()) ans++;

            for (int k = 0; k < N; k++) {
                seq[k] = board[k][i];
            }

            if (isHappy()) ans++;
        }

        System.out.print(ans);
    }

    public static boolean isHappy() {
        int cnt = 1;
        int maxCnt = 1;

        for (int i = 1; i < N; i++) {
            if (seq[i] == seq[i - 1]) cnt++;
            else cnt = 1;

            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt >= M;
    }
}