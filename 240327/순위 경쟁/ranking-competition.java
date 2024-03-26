import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int aScore = 0;
        int bScore = 0;
        int cScore = 0;

        int win = 0; // a, b, c = 0 / a = 1 / b = 2 / c = 3 / a, b = 4 / b, c = 5 / a, c = 6

        int ans = 0;

        for (int i = 0; i < N; i++) {
            char c = sc.next().charAt(0);
            int score = sc.nextInt();

            if (c == 'A') aScore += score;
            else if (c == 'B') bScore += score;
            else cScore += score;

            if (aScore > bScore && aScore > cScore && win != 1) {
                win = 1;
                ans++;
            } else if (bScore > aScore && bScore > cScore && win != 2) {
                win = 2;
                ans++;
            } else if (cScore > aScore && cScore > bScore && win != 3) {
                win = 3;
                ans++;
            } else if (aScore > cScore && aScore == bScore && win != 4) {
                win = 4;
                ans++;
            } else if (bScore > aScore && bScore == cScore && win != 5) {
                win = 5;
                ans++;
            } else if (cScore > bScore && aScore == cScore && win != 6) {
                win = 6;
                ans++;
            } else if (aScore == bScore && bScore == cScore && win != 0) {
                win = 0;
                ans++;
            }
        }

        System.out.print(ans);
    }
}