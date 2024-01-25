import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[20][20];

        for (int i = 1; i < 20; i++) {

            for (int k = 1; k < 20; k++) {

                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;
        int width = 0;
        int height = 0;

        for (int i = 1; i < 20; i++) {

            for (int k = 1; k < 20; k++) {
                // 아무것도 없을 때
                if (board[i][k] == 0) continue;


                // 흑, 백 중 하나가 있을 경우
                // 현재 위치에서 가로, 세로, 대각선 위, 대각선 아래를 각각 비교하면서 현재 위치의 돌과 이어지게 일치하는 조건이 있는지 확인
                if (checkWidth(board, i, k)) {
                    ans = board[i][k];
                    width = k + 2;
                    height = i;

                    break;
                }

                if (checkHeight(board, i, k)) {
                    ans = board[i][k];
                    width = k;
                    height = i + 2;

                    break;
                }

                if (checkDiagonalUp(board, i, k)) {
                    ans = board[i][k];
                    width = k + 2;
                    height = i - 2;

                    break;
                }

                if (checkDiagonalDown(board, i, k)) {
                    ans = board[i][k];
                    width = k + 2;
                    height = i + 2;

                    break;
                }
            }

            if (ans != 0) break;
        }

        System.out.println(ans);

        if (ans != 0) System.out.printf("%d %d", height, width);
    }

    public static boolean checkWidth(int[][] board, int i, int k) {
        if (k + 4 >= 20) return false;

        int color = board[i][k];

        for (int w = 0; w < 5; w++) {
            if (color != board[i][w + k]) return false;
        }

        return true;
    }

    public static boolean checkHeight(int[][] board, int i, int k) {
        if (i + 4 >= 20) return false;

        int color = board[i][k];

        for (int h = 0; h < 5; h++) {
            if (color != board[i + h][k]) return false;
        }

        return true;
    }

    public static boolean checkDiagonalUp(int[][] board, int i, int k) {
        if (k + 4 >= 20 || i - 4 < 1) return false;

        int color = board[i][k];

        for (int j = 0; j < 5; j++) {
            if (color != board[i - j][k + j]) return false;
        }

        return true;
    }

    public static boolean checkDiagonalDown(int[][] board, int i, int k) {
        if (k + 4 >= 20 || i + 4 >= 20) return false;

        int color = board[i][k];

        for (int j = 0; j < 5; j++) {
            if (color != board[i + j][k + j]) return false;
        }

        return true;
    }
}