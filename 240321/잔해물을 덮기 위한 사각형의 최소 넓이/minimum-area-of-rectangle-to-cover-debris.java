import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int OFFSET = 1000;
        int[][] board = new int[1001 + OFFSET][1001 + OFFSET];

        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;

        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;

        for (int i = y1; i < y2; i++) {
            for (int k = x1; k < x2; k++) {
                board[i][k] = 1;
            }
        }

        x1 = sc.nextInt() + OFFSET;
        y1 = sc.nextInt() + OFFSET;

        x2 = sc.nextInt() + OFFSET;
        y2 = sc.nextInt() + OFFSET;

        for (int i = y1; i < y2; i++) {
            for (int k = x1; k < x2; k++) {
                board[i][k] = 2;
            }
        }

        int minX = 2001;
        int minY = 2001;

        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 1) {
                    minX = Math.min(minX, k);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, k);
                    maxY = Math.max(maxY, i);
                }
            }
        }

        if (minX == 2001) System.out.print(0);
        else System.out.print((maxX - minX + 1) * (maxY - minY + 1));
    }
}