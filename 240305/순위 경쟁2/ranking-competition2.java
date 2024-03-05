import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int aScore = 0;
        int bScore = 0;

        int ans = 0;
        
        // 0 : a, b   /   1 : a   /   2 : b
        int curFirst = 0;

        for (int i = 0; i < N; i++) {
            char p = sc.next().charAt(0);
            int score = sc.nextInt();

            if (p == 'A') aScore += score;
            else if (p == 'B') bScore += score;

            if (aScore > bScore && curFirst != 1) {
                ans++;
                curFirst = 1;
            } else if (aScore < bScore && curFirst != 2) {
                ans++;
                curFirst = 2;
            } else if (aScore == bScore && curFirst != 0) {
                ans++;
                curFirst = 0;
            }
        }

        System.out.print(ans);
    }
}