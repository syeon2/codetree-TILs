import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] board = new char[R][C];

        for (int r = 0; r < R; r++) {

            for (int c = 0; c < C; c++) {

                board[r][c] = sc.next().charAt(0);
            }
        }

        if (board[0][0] == board[R - 1][C - 1]) System.out.print(0);
        else {
            int cnt = 0;

            for (int i = 1; i < R; i++) {

                for (int k = 1; k < C; k++) {

                    if (board[i][k] == board[0][0]) continue;
                    else {

                        for (int i2 = i + 1; i2 < R - 1; i2++) {

                            for (int k2 = k + 1; k2 < C - 1; k2++) {
                                if (board[i][k] == board[i2][k2]) continue;
                                else {
                                    cnt++;
                                }
                            }
                        }
                    }
                }
            }

            System.out.print(cnt);
        }
    }
}