import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] board = new int[201][201];
        int OFFSET = 100;

        for (int t = 1; t <= T; t++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int i = y1; i < y2; i++) {
                for (int k = x1; k < x2; k++) {
                    if (t % 2 == 1) board[i][k] = 1;
                    else board[i][k] = 2;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 2) ans++;
            }
        }

        System.out.print(ans);
    }
}