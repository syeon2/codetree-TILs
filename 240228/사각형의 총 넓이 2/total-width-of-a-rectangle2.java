import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] board = new int[201][201];

        int OFFSET = 100;
        
        int curX = OFFSET;
        int curY = OFFSET;

        for (int t = 0; t < T; t++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int i = Math.min(y1, y2); i < Math.max(y1, y2); i++) {

                for (int k = Math.min(x1, x2); k < Math.max(x1, x2); k++) {
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