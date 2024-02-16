import java.util.Scanner;

public class Main {

    public static int[][] board = new int[201][201];
    public static int OFFSET = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 > x2 && y1 > y2) {
                for (int i = y2; i < y1; i++) {
                    for (int k = x2; k < x1; k++) {
                        board[i + OFFSET][k + OFFSET]++;
                    }
                }
            } else {
                for (int i = y1; i < y2; i++) {
                    for (int k = x1; k < x2; k++) {
                        board[i + OFFSET][k + OFFSET]++;
                    }
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