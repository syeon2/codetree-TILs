import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];

        for (int i = 1; i <= 3; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 1000;
            y1 += 1000;

            x2 += 1000;
            y2 += 1000;

            for (int k = x1; k < x2; k++) {

                for (int j = y1; j < y2; j++) {
                    board[j][k] = i;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < board.length; i++) {

            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 1 || board[i][k] == 2) ans++;
            }
        }

        System.out.print(ans);
    }
}