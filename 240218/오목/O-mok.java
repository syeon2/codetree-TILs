import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[20][20];

        for (int i = 1; i <= 19; i++) {

            for (int k = 1; k <= 19; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int win = 0;
        int xPos = 0;
        int yPos = 0;

        for (int i = 1; i <= 15; i++) {

            for (int k = 1; k <= 15; k++) {
                if (board[i][k] == 0) continue;

                int curStone = board[i][k];

                if (board[i + 1][k] == curStone && board[i + 2][k] == curStone && board[i + 3][k] == curStone && board[i + 4][k] == board[i][k]) {
                    win = board[i][k];
                    xPos = k;
                    yPos = i + 2;
                } else if (board[i][k + 1] == curStone && board[i][k + 2] == curStone && board[i][k + 3] == curStone && board[i][k + 4] == curStone) {
                    win = board[i][k];
                    xPos = k + 2;
                    yPos = i;
                } else if (board[i + 1][k + 1] == curStone && board[i + 2][k + 2] == curStone && board[i + 3][k + 3] == curStone && board[i + 4][k + 4] == curStone) {
                    win = board[i][k];
                    xPos = k + 2;
                    yPos = i + 2;
                }

                if (win != 0) break;
            }

            if (win != 0) break;
        }

        if (win == 0) System.out.print(win);
        else {
            System.out.println(win);
            System.out.printf("%d %d", yPos, xPos);
        }
    }
}