import java.util.*;

public class Main {

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
            char direc = sc.next().charAt(0);

            // 기본 col
            blowWind(col, direc);

            // 아래로
            int cnt = 0;
            int tempDown = col;
            while (checkRow(tempDown, tempDown + 1)) {
                tempDown++;
                cnt++;

                if (cnt % 2 == 0) blowWind(tempDown, direc);
                else {
                    char d = (direc == 'L') ? 'R' : 'L';

                    blowWind(tempDown, d);
                }
            }

            cnt = 0;
            int tempUp = col;
            while (checkRow(tempUp, tempUp - 1)) {
                tempUp--;
                cnt++;

                if (cnt % 2 == 0) blowWind(tempUp, direc);
                else {
                    char d = (direc == 'L') ? 'R' : 'L';

                    blowWind(tempUp, d);
                }
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
        if (col1 < 0 || col1 >= N || col2 < 0 || col2 >= N) return false;

        for (int i = 0; i < M; i++) {
            if (board[col1][i] == board[col2][i]) return true;
        }

        return false;
    }

    public static void blowWind(int col, char direc) {
        if (direc == 'L') {
            int temp = board[col][M - 1];

            for (int i = M - 1; i >= 1; i--) {
                board[col][i] = board[col][i - 1];
            }

            board[col][0] = temp;
        } else {
            int temp = board[col][0];

            for (int i = 0; i < M - 1; i++) {
                board[col][i] = board[col][i + 1];
            }

            board[col][M - 1] = temp;
        }
    }
}