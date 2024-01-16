import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] positive = new int[1001];
        int[] negative = new int[1001];

        int curPos = 0;

        for (int i = 0; i < N; i++) {
            int move = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int k = curPos; k < curPos + move; k++) {
                    if (k < 0) negative[k * -1]++;
                    else positive[k]++;
                }

                curPos += move;
            } else {
                for (int k = curPos; k > curPos - move; k--) {
                    if (k < 0) negative[k * -1]++;
                    else positive[k]++;
                }

                curPos -= move;
            }
        }

        int cnt = 0;

        for (int i = 0; i < 1001; i++) {
            if (positive[i] >= 2) cnt++;
            if (negative[i] >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}