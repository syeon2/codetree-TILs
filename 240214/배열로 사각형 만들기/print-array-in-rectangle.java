import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[6][6];

        for (int i = 1; i < 6; i++) {

            for (int k = 1; k < 6; k++) {

                if (i == 1 || k == 1) board[i][k] = 1;
                else {
                    board[i][k] = board[i - 1][k] + board[i][k - 1];
                }
            }
        }

        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {

                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}