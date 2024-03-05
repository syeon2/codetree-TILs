import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String str = sc.next();

            for (int k = 0; k < 10; k++) {
                board[i][k] = str.charAt(k);
            }
        }

        int lX = 0;
        int lY = 0;

        int bX = 0;
        int bY = 0;

        int rX = 0;
        int rY = 0;

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (board[i][k] == 'B') {
                    bX = k;
                    bY = i;
                }

                if (board[i][k] == 'L') {
                    lX = k;
                    lY = i;
                }

                if (board[i][k] == 'R') {
                    rX = k;
                    rY = i;
                }
            }
        }

        if (lX == rX && rX == bX && (Math.min(lX, bX) < rX && Math.max(lX, bX) > rX)) {
            int width = Math.abs(lX - bX) - 1;
            int turn = 2;

            System.out.print(width + turn);
        } else if (lY == rY && rY == bY && (Math.min(lY, bY) < rY && Math.max(lY, bY) > rY)) {
            int height = Math.abs(lY - bY) - 1;
            int turn = 2;

            System.out.print(height + turn);
        } else {
            if (lX == bX) {
                System.out.print(Math.abs(lX - bX) - 1);
            } else if (lY == bY) {
                System.out.print(Math.abs(lY - bY) - 1);
            } else {
                int width = Math.abs(lX - bX);
                int height = Math.abs(lY - bY);

                System.out.print(width + height - 1);
            }
        }
    }
}