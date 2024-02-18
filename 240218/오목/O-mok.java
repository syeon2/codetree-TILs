import java.util.Scanner;

public class Main {

    public static int[][] board = new int[19][19];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            for (int k = 0; k < 19; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int win = 0;
        int xPos = 0;
        int yPos = 0;

        for (int i = 0; i < 19; i++) {
            for (int k = 0; k < 19; k++) {
                if (board[i][k] == 0) continue;

                if (checkRightUp(k, i)) {
                    win = board[i][k];
                    xPos = k + 1 + 2;
                    yPos = i + 1 - 2;
                } else if (checkRightDown(k, i)) {
                    win = board[i][k];
                    xPos = k + 1 + 2;
                    yPos = i + 1 + 2;
                } else if (checkRight(k, i)) {
                    win = board[i][k];
                    xPos = k + 1 + 2;
                    yPos = i + 1;
                } else if (checkDown(k, i)) {
                    win = board[i][k];
                    xPos = k + 1;
                    yPos = i + 1 + 2;
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

    public static boolean checkRightUp(int x, int y) {
        int cnt = 0;
        int curStone = board[y][x];

        while (isRange(x, y) && curStone == board[y][x]) {
            cnt++;
            y--;
            x++;
        }

        if (cnt == 5) return true;
        else return false;
    }

    public static boolean checkRightDown(int x, int y) {
        int cnt = 0;
        int curStone = board[y][x];

        while (isRange(x, y) && curStone == board[y][x]) {
            cnt++;
            y++;
            x++;
        }

        if (cnt == 5) return true;
        else return false;
    }

    public static boolean checkRight(int x, int y) {
        int cnt = 0;
        int curStone = board[y][x];

        while (isRange(x, y) && curStone == board[y][x]) {
            cnt++;
            x++;
        }

        if (cnt == 5) return true;
        else return false;
    }

    public static boolean checkDown(int x, int y) {
        int cnt = 0;
        int curStone = board[y][x];

        while (isRange(x, y) && curStone == board[y][x]) {
            cnt++;
            y++;
        }

        if (cnt == 5) return true;
        else return false;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < 19 && y >= 0 && y < 19) return true;

        return false;
    }
}