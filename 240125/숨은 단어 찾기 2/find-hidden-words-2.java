import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {

            String str = sc.next();

            for (int k = 0; k < M; k++) {
                board[i][k] = str.charAt(k);    
            }
        }

        int cnt = 0;

        // L이 등장하는 포인트에서 EE가 연속해서 나오는지 확인

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < M; k++) {

                if (board[i][k] != 'L') continue;

                if (backWidth(board, i, k)) cnt++;
                if (frontWidth(board, i , k)) cnt++;
                if (upHeight(board, i, k)) cnt++;
                if (downHeight(board, i, k)) cnt++;
                if (backUpDiagonal(board, i, k)) cnt++;
                if (frontUpDiagonal(board, i, k)) cnt++;
                if (backDownDiagonal(board, i, k)) cnt++;
                if (frontDownDiagonal(board, i, k)) cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean backWidth(char[][] board, int h, int w) {
        if (w - 2 < 0) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h][w - i] != 'E') return false;
        }

        return true;
    }

    public static boolean frontWidth(char[][] board, int h, int w) {
        if (w + 2 >= board[h].length) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h][w + i] != 'E') return false;
        }

        return true;
    }

    public static boolean upHeight(char[][] board, int h, int w) {
        if (h - 2 < 0) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h - i][w] != 'E') return false;
        }

        return true;
    }

    public static boolean downHeight(char[][] board, int h, int w) {
        if (h + 2 >= board.length) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h + i][w] != 'E') return false;
        }

        return true;
    }

    public static boolean backUpDiagonal(char[][] board, int h, int w) {
        if (h - 2 < 0 || w - 2 < 0) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h - i][w - i] != 'E') return false;
        }

        return true;
    }

    public static boolean frontUpDiagonal(char[][] board, int h, int w) {
        if (h - 2 < 0 || w + 2 >= board[h].length) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h - i][w + i] != 'E') return false;
        }

        return true;
    }

    public static boolean backDownDiagonal(char[][] board, int h, int w) {
        if (h + 2 >= board.length || w - 2 < 0) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h + i][w - i] != 'E') return false;
        }

        return true;
    }

    public static boolean frontDownDiagonal(char[][] board, int h, int w) {
        if (h + 2 >= board.length || w + 2 >= board[h].length) return false;

        for (int i = 1; i <= 2; i++) {
            if (board[h + i][w + i] != 'E') return false;
        }

        return true;
    }
}