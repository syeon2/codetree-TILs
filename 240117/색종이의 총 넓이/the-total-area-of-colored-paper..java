import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[201][201];

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;

            int x2 = x1 + 8;
            int y2 = y1 + 8;

            for (int k = x1; k < x2; k++) {

                for (int j = y1; j < y2; j++) {
                    board[j][k] = 1;
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