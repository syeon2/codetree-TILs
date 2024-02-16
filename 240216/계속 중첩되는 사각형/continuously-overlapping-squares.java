import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 1 : 빨, 2 : 파
        int[][] board = new int[2001][2001];
        int offset = 1000;

        int N = sc.nextInt();

        for (int n = 1; n <= N; n++) {
            int color = n % 2 == 1 ? 1 : 2;

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int i = Math.min(y1, y2); i < Math.max(y1, y2); i++) {
                for (int k = Math.min(x1, x2); k < Math.max(x1, x2); k++) {
                    board[i + offset][k + offset] = color;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 2) cnt++;
            }
        }

        System.out.print(cnt);
    }
}