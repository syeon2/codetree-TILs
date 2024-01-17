import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[201][201];

        for (int n = 1; n <= N; n++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 100;
            y1 += 100;
            x2 += 100;
            y2 += 100;

            for (int i = x1; i < x2; i++) {

                for (int k = y1; k < y2; k++) {
                    if (n % 2 == 1) board[k][i] = 1;
                    else board[k][i] = 2;
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