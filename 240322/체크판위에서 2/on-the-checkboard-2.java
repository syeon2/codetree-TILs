import java.util.*;

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

        int ans = 0;

        char start = board[0][0];

        for (int i = 1; i < R - 1; i++) {
            for (int k = 1; k < C - 1; k++) {

                if (board[i][k] == start) continue;

                for (int l = i + 1; l < R - 1; l++) {
                    for (int m = k + 1; m < C - 1; m++) {

                        if (l < R && m < C && board[l][m] == start && board[l][m] != board[R - 1][C - 1]) ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}