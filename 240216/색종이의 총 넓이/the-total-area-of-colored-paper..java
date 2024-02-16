import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[201][201];
        int offset = 100;

        for (int n = 0; n < N; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x + offset; i < (x + offset) + 8; i++) {

                for (int k = y + offset; k < (y + offset) + 8; k++) {
                    board[k][i]++;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] >= 1) cnt++;
            }
        }

        System.out.print(cnt);
    }
}