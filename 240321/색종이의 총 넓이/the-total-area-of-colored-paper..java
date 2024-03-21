import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int OFFSET = 100;
        int[][] board = new int[101 + OFFSET][101 + OFFSET];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = x1 + 8;
            int y2 = y1 + 8;

            for (int k = y1; k < y2; k++) {
                for (int l = x1; l < x2; l++) {
                    board[k][l] = 1;
                }
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