import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[201][201];

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 100;
            y1 += 100;

            x2 += 100;
            y2 += 100;

            for (int k = x1; k < x2; k++) {

                for (int l = y1; l < y2; l++) {
                    board[l][k] = 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {

            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 1) ans++;
            }
        }

        System.out.print(ans);
    }
}