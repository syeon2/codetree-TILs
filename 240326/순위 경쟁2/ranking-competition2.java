import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int aScore = 0;
        int bScore = 0;

        int win = 0; // a, b = 0, a = 1, b = 2;

        int ans = 0;

        for (int i = 0; i < N; i++) {
            char student = sc.next().charAt(0);
            int score = sc.nextInt();

            if (student == 'A') aScore += score;
            else bScore += score;

            if (aScore == bScore && win != 0) {
                ans++;
                win = 0;
            } else if (aScore > bScore && win != 1) {
                ans++;
                win = 1;
            } else if (bScore > aScore && win != 2) {
                ans++;
                win = 2;
            }
        }

        System.out.print(ans);
    }
}