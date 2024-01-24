import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];

        for (int i = 0; i < 19; i++) {

            for (int k = 0; k < 19; k++) {

                board[i][k] = sc.nextInt();
            }
        }

        int isEndGame = 0;
        int width = 0;
        int height = 0;

        for (int i = 0; i < 19; i++) {

            for (int k = 0; k < 19; k++) {
                int cnt1 = 0;

                if (board[i][k] == 0) continue;
                if (i + 5 >= 19 || k + 5 >= 19) continue;

                // 가로로 이겼을 경우
                for (int j = 0; j < 5; j++) {
                    if (board[i][k] == board[i][k + j]) cnt1++;
                    else break;
                }

                if (cnt1 == 5) {
                    width = k + 3;
                    height = i + 1;

                    if (board[i][k] == 1) {
                        isEndGame = 1;
                        break;
                    } else {
                        isEndGame = 2;
                        break;
                    }
                }

                // 세로로 이겼을 경우
                int cnt2 = 0;
                for (int j = 0; j < 5; j++) {
                    if (board[i][k] == board[i + j][k]) cnt2++;
                    else break;
                }

                if (cnt2 == 0) {
                    width = k + 1;
                    height = i + 3;

                    if (board[i][k] == 1) {
                        isEndGame = 1;
                        break;
                    } else {
                        isEndGame = 2;
                        break;
                    }
                }

                // 대각선 위로 이겼을 경우
                int cnt3 = 0;
                for (int j = 0; j < 5; j++) {
                    if (board[i][k] == board[i + j][k + j]) cnt3++;
                    else break;
                }

                if (cnt3 == 5) {
                    width = k + 3;
                    height = i + 3;

                    if (board[i][k] == 1) {
                        isEndGame = 1;
                        break;
                    } else {
                        isEndGame = 2;
                        break;
                    }
                }

                int cnt4 = 0;
                for (int j = 0; j < 5; j++) {
                    if (i - j < 0) break;

                    if (board[i][k] == board[i - j][k + j]) cnt4++;
                    else break;
                }

                if (cnt4 == 5) {
                    width = k + 3;
                    height = i - 1;

                    if (board[i][k] == 1) {
                        isEndGame = 1;
                        break;
                    } else {
                        isEndGame = 2;
                        break;
                    }
                }

                if (isEndGame != 0) break;
            }

            if (isEndGame != 0) break;
        }

        System.out.println(isEndGame);

        if (isEndGame != 0) {
            System.out.printf("%d %d", height, width);
        }
    }
}