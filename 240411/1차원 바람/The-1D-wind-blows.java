import java.util.*;

public class Main {

    public static int DIREC_RIGHT = 0;
    public static int DIREC_LEFT = 1;

    public static int N;
    public static int M;
    public static int Q;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);        

        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (Q-- > 0) {
            int col = sc.nextInt() - 1;
            int direc = (sc.next().charAt(0) == 'L') ? DIREC_LEFT : DIREC_RIGHT;

            shift(col, direc);

            int curDirec = filp(direc);
            for (int i = col; i < N - 1; i++) {
                if (checkRow(i, i + 1)) shift(i + 1, curDirec);
                else break;

                curDirec = filp(curDirec);
            }

            curDirec = filp(direc);
            for (int i = col; i > 0; i--) {
                if (checkRow(i, i - 1)) shift(i - 1, curDirec);
                else break;

                curDirec = filp(curDirec);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                sb.append(board[i][k]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static boolean checkRow(int col1, int col2) {
        for (int i = 0; i < M; i++) {
            if (board[col1][i] == board[col2][i]) return true;
        }

        return false;
    }

    public static int filp(int direc) {
        return (direc == 1) ? 0 : 1;
    }

    public static void shift(int col, int direc) {
        if (direc == 0) {
            int temp = board[col][0];

            for (int i = 0; i < M - 1; i++) {
                board[col][i] = board[col][i + 1];
            }

            board[col][M - 1] = temp;
        } else {
            int temp = board[col][M - 1];

            for (int i = M - 1; i >= 1; i--) {
                board[col][i] = board[col][i - 1];
            }

            board[col][0] = temp;
        }
    }
}