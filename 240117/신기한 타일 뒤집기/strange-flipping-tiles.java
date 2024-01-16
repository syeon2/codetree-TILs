import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] negative = new int[100001];
        int[] positive = new int[100001];

        int curPos = 0;

        for (int i = 0; i < N; i++) {
            int move = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int k = curPos; k < curPos + move; k++) {
                    if (k < 0) negative[k * -1] = 2;
                    else positive[k] = 2;
                }

                curPos += (move - 1);
            } else {
                for (int k = curPos; k > curPos - move; k--) {
                    if (k < 0) negative[k * -1] = 1;
                    else positive[k] = 1;
                }

                curPos -= (move - 1);
            }
        }

        int white = 0;
        int black = 0;

        for (int i = 0; i < 100001; i++) {
            if (negative[i] == 1) white++;
            else if (negative[i] == 2) black++;

            if (positive[i] == 1) white++;
            else if (positive[i] == 2) black++;
        }

        System.out.printf("%d %d", white, black);
    }
}