import java.util.*;

public class Main {

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (Q-- > 0) {
            int row = sc.nextInt() - 1;
            char d = sc.next().charAt(0);

            int direc = 0;
            if (d == 'R') direc = 1;
            else direc = 0;

            move(row, direc);

            int upTempDirec = direc;
            for (int r = row; r > 0; r--) {
                if (match(r, r - 1)) {
                    upTempDirec = (upTempDirec + 1) % 2;

                    move(r - 1, upTempDirec);
                } else break;
            }

            int downTempDirec = direc;
            for (int r = row; r < N - 1; r++) {
                if (match(r, r + 1)) {
                    downTempDirec = (downTempDirec + 1) % 2;

                    move(r + 1, downTempDirec);
                } else break;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }

    public static boolean match(int row1, int row2) {
        for (int i = 0; i < board[row1].length; i++) {
            if (board[row1][i] == board[row2][i]) return true;
        }

        return false;
    }

    public static void move(int row, int direc) {
        // R == 1
        if (direc == 0) {
            int temp = board[row][board[row].length - 1];

            for (int i = board[row].length - 1; i > 0; i--) {
                board[row][i] = board[row][i - 1];
            }

            board[row][0] = temp;
        } else {
            int temp = board[row][0];

            for (int i = 1; i < board[row].length; i++) {
                board[row][i - 1] = board[row][i];
            }

            board[row][board[row].length - 1] = temp;
        }
    }
}