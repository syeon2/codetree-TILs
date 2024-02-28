import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];
        int OFFSET = 1000;

        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;
        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;

        for (int i = y1; i <= y2; i++) {
            for (int k = x1; k <= x2; k++) {
                board[i][k] = 1;
            }
        }

        int x3 = sc.nextInt() + OFFSET;
        int y3 = sc.nextInt() + OFFSET;
        int x4 = sc.nextInt() + OFFSET;
        int y4 = sc.nextInt() + OFFSET;

        for (int i = y3; i <= y4; i++) {
            for (int k = x3; k <= x4; k++) {
                board[i][k] = 2;
            }
        }

        int xMin = 2002;
        int xMax = -1;
        int yMin = 2001;
        int yMax = -1;

        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 1) {
                    if (i < yMin) yMin = i;
                    if (i > yMax) yMax = i;
                    if (k < xMin) xMin = k;
                    if (k > xMax) xMax = k;
                }
            }
        }

        int ans = (xMax - xMin) * (yMax - yMin);

        if (xMin == 2002) System.out.print(0);
        else System.out.print(ans);
    }
}