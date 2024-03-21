import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int OFFSET = 100;
        int[][] board = new int[101 + OFFSET][101 + OFFSET];

        for (int n = 1; n <= N; n++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int i = y1; i < y2; i++) {
                for (int k = x1; k < x2; k++) {
                    if (n % 2 == 1) board[i][k] = 1; // 빨
                    else board[i][k] = 2; // 파
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