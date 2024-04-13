import java.util.*;

public class Main {

    public static int[][] board = new int[4][4];
    public static char direc;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        direc = sc.next().charAt(0);

        if (direc == 'R') turnRight();
        else if (direc == 'L') turnLeft();
        else if (direc == 'U') turnUp();

        for (int i = 0; i < 4; i++) {
            shift(i);
        }

        if (direc == 'R') turnLeft();
        else if (direc == 'L') turnRight();
        else if (direc == 'U') turnUp();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void shift(int col) {
        for (int i = 3; i >= 0; i--) {
            if (board[i][col] == 0) {
                for (int k = i - 1; k >= 0; k--) {
                    if (board[k][col] != 0) {
                        board[i][col] = board[k][col];
                        board[k][col] = 0;
                        i++;
                        break;
                    }
                }
            } else {
                for (int k = i - 1; k >= 0; k--) {
                    if (board[k][col] != 0 && board[k][col] == board[i][col]) {
                        board[i][col] *= 2;
                        board[k][col] = 0;
                        break;
                    } else if (board[k][col] != 0 && board[k][col] != board[i][col]) {
                        break;
                    }
                }
            }
        }
    }

    public static void turnLeft() {
        int[][] temp = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                temp[i][k] = board[k][3 - i];
            }
        }

        board = temp;
    }

    public static void turnRight() {
        int[][] temp = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                temp[i][k] = board[3 - k][i];
            }
        }

        board = temp;
    }

    public static void turnUp() {
        int[][] temp = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                temp[i][k] = board[3 - i][k];
            }
        }

        board = temp;
    }
}