import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] board = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int k = 0; k < C; k++) {
                board[i][k] = sc.next().charAt(0);
            }
        }

        int cnt = 0;
        for (int i = 1; i < R; i++) {
            for (int k = 1; k < C; k++) {
                if (board[0][0] != board[i][k]) {
                    for (int l = i + 1; l < R; l++) {
                        for (int m = k + 1; m < C; m++) {
                            if (board[i][k] != board[l][m]) {
                                if (l < R - 1 && m < C - 1 && board[l][m] != board[R - 1][C - 1]) cnt++;
                            }
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}