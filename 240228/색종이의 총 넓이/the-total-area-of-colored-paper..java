import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] board = new int[201][201];
        int OFFSET = 100;

        for (int t = 0; t < T; t++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for (int i = y; i < y + 8; i++) {
                for (int k = x; k < x + 8; k++) {
                    board[i][k]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < board.length; i++) {

            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] >= 1) ans++;
            }
        }

        System.out.print(ans);
    }
}