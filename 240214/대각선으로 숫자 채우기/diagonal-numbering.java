import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 1;

        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {

            int x = i;
            int y = 0;

            while (x >= 0 && y < m) {
                board[y++][x--] = cnt++;
            }
        }

        for (int i = 1; i < m; i++) {

            int x = n - 1;
            int y = i;

            while (x >= 0 && y < m) {
                board[y++][x--] = cnt++;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < m; k++) {

                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}