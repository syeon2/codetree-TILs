import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            char[] list = sc.next().toCharArray();

            for (int k = 0; k < 3; k++) {
                board[i][k] = list[k] - '0';
            }
        }

        int ans = 0;

        for (int i = 1; i <= 9; i++) {
            for (int k = i + 1; k <= 9; k++) {

                boolean isWin = false;

                for (int j = 0; j < 3; j++) {
                    int a1 = board[j][0];
                    int b1 = board[j][1];
                    int c1 = board[j][2];

                    if (a1 == b1 && b1 == c1) continue;

                    if ((a1 == i || a1 == k) && (b1 == i || b1 == k) && (c1 == i || c1 == k)) isWin = true;
                }

                for (int j = 0; j < 3; j++) {
                    int a1 = board[0][j];
                    int b1 = board[1][j];
                    int c1 = board[2][j];

                    if (a1 == b1 && b1 == c1) continue;

                    if ((a1 == i || a1 == k) && (b1 == i || b1 == k) && (c1 == i || c1 == k)) isWin = true;
                }

                int a1 = board[0][0];
                int b1 = board[1][1];
                int c1 = board[2][2];

                if (!(a1 == b1 && b1 == c1) && (a1 == i || a1 == k) && (b1 == i || b1 == k) && (c1 == i || c1 == k)) isWin = true;


                a1 = board[2][0];
                b1 = board[1][1];
                c1 = board[0][2];

                if (!(a1 == b1 && b1 == c1) && (a1 == i || a1 == k) && (b1 == i || b1 == k) && (c1 == i || c1 == k)) isWin = true;

                if (isWin) ans++;
            }
        }

        System.out.print(ans);
    }
}