import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 1 = white, 2 = black, 3 = gray
        int[] negative = new int[100001];
        int[] negativeWhite = new int[100001];
        int[] negativeBlack = new int[100001];

        int[] positive = new int[100001];
        int[] positiveWhite = new int[100001];
        int[] positiveBlack = new int[100001];

        int curPos = 0;

        for (int i = 0; i < N; i++) {
            int move = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int k = curPos; k < curPos + move; k++) {
                    if (k < 0) {
                        if (negative[k * -1] == 3) continue;
                        else {
                            negative[k * -1] = 2;
                            negativeBlack[k * -1]++;
                        }

                        if (negativeBlack[k * -1] >= 2 && negativeWhite[k * -1] >= 2) negative[k * -1] = 3;
                    } else {
                        if (positive[k] == 3) continue;
                        else {
                            positive[k] = 2;
                            positiveBlack[k]++;
                        }

                        if (positiveBlack[k] >= 2 && positiveWhite[k] >= 2) positive[k] = 3;
                    }
                }

                curPos += (move - 1);
            } else {
                for (int k = curPos; k > curPos - move; k--) {
                    if (k < 0) {
                        if (negative[k * -1] == 3) continue;
                        else {
                            negative[k * -1] = 1;
                            negativeWhite[k * -1]++;
                        }

                        if (negativeBlack[k * -1] >= 2 && negativeWhite[k * -1] >= 2) negative[k * -1] = 3;

                    } else {
                        if (positive[k] == 3) continue;
                        else {
                            positive[k] = 1;
                            positiveWhite[k]++;
                        }

                        if (positiveBlack[k] >= 2 && positiveWhite[k] >= 2) positive[k] = 3;
                    }
                }

                curPos -= (move - 1);
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i < 100001; i++) {
            if (negative[i] == 1) white++;
            else if (negative[i] == 2) black++;
            else if (negative[i] == 3) gray++;

            if (positive[i] == 1) white++;
            else if (positive[i] == 2) black++;
            else if (positive[i] == 3) gray++;
        }

        System.out.printf("%d %d %d", white, black, gray);
    }
}