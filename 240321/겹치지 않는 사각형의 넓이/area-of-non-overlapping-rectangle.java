import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int OFFSET = 1000;
        int[][] board = new int[1001 + OFFSET][1001 + OFFSET];

        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int k = y1; k < y2; k++) {
                for (int l = x1; l < x2; l++) {
                    board[k][l] = 1;
                }
            }
        }

        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;
        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;

        for (int i = y1; i < y2; i++) {
            for (int k = x1; k < x2; k++) {
                board[i][k] = 2;
            }
        }

        int ans = 0;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 1) ans++;
            }
        }

        System.out.print(ans);
    }
}