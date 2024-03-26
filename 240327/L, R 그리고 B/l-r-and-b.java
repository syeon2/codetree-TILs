import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[10][10];

        int Lx = 0;
        int Ly = 0;

        int Rx = 0;
        int Ry = 0;

        int Bx = 0;
        int By = 0;

        for (int i = 0; i < 10; i++) {
            char[] list = sc.next().toCharArray();

            for (int k = 0; k < 10; k++) {
                board[i][k] = list[k];

                if (board[i][k] == 'L') {
                    Lx = k;
                    Ly = i;
                } else if (board[i][k] == 'R') {
                    Rx = k;
                    Ry = i;
                } else if (board[i][k] == 'B') {
                    Bx = k;
                    By = i;
                }
            }
        }

        int ans = 0;

        if (Lx == Bx && Lx == Rx && ((Ly <= Ry && Ry <= By) || (By <= Ry && Ry <= Ly))) {
            ans = Math.abs(Ly - By) + 1;
        } else if (Ly == By && By == Ry && ((Lx <= Rx && Rx <= Bx) || (Bx <= Rx && Rx <= Lx))) {
            ans = Math.abs(Lx - Bx) + 1;
        } else {
            ans = Math.abs(Lx - Bx) + Math.abs(Ly - By) - 1;
        }

        System.out.print(ans);
    }
}