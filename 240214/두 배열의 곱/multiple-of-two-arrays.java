import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                System.out.printf("%d ", board[i][k] * sc.nextInt());
            }

            System.out.println();
        }
    }
}