import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int offset = 1000;
        int[][] board = new int[2001][2001];

        for (int n = 0; n < 2; n++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 < x2 && y1 < y2) {
                for (int i = y1; i < y2; i++) {

                    for (int k = x1; k < x2; k++) {
                        board[i + offset][k + offset]++;
                    }
                }
            } else {
                for (int i = y2; i < y1; i++) {

                    for (int k = x2; k < x1; k++) {
                        board[i + offset][k + offset]++;
                    }
                }
            }
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        for (int i = Math.min(y1, y2); i < Math.max(y1, y2); i++) {

            for (int k = Math.min(x1, x2); k < Math.max(x1, x2); k++) {
                board[i + offset][k + offset]--;
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