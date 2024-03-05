import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String str = sc.next();

            for (int k = 0; k < 3; k++) {
                board[i][k] = str.charAt(k) - '0';
            }
        }

        int ans = 0;

        for (int i = 1; i <= 9; i++) {
            for (int k = i + 1; k <= 9; k++) {
                boolean flag = false;

                for (int j = 0; j < 3; j++) {
                    int iCnt = 0;
                    int kCnt = 0;

                    for (int l = 0; l < 3; l++) {
                        if (board[j][l] == i) iCnt++;
                        if (board[j][l] == k) kCnt++;    
                    }

                    if (iCnt != 3 && kCnt != 3 && (iCnt + kCnt) == 3) {
                        flag = true;
                    }
                }

                for (int j = 0; j < 3; j++) {
                    int iCnt = 0;
                    int kCnt = 0;

                    for (int l = 0; l < 3; l++) {
                        if (board[l][j] == i) iCnt++;
                        if (board[l][j] == k) kCnt++;
                    }

                    if (iCnt != 3 && kCnt != 3 && (iCnt + kCnt) == 3) {
                        flag = true;
                    }
                }

                int iCnt = 0;
                int kCnt = 0;
                for (int j = 0; j < 3; j++) {
                    if (board[j][j] == i) iCnt++;
                    if (board[j][j] == k) kCnt++;
                }

                if (iCnt != 3 && kCnt != 3 && (iCnt + kCnt) == 3) {
                    flag = true;
                }

                iCnt = 0;
                kCnt = 0;
                for (int j = 0; j < 3; j++) {
                    if (board[j][2 - j] == i) iCnt++;
                    if (board[j][2 - j] == k) kCnt++;
                }

                if (iCnt != 3 && kCnt != 3 && (iCnt + kCnt) == 3) {
                    flag = true;
                }

                if (flag) ans++;
            }
        }

        System.out.print(ans);
    }
}