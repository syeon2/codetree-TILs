import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 0 -> A, 1 -> B, 2 -> C
        boolean[] isFirst = new boolean[3];
        Arrays.fill(isFirst, true);

        int aScore = 0;
        int bScore = 0;
        int cScore = 0;

        int ans = 0;

        for (int i = 0; i < N; i++) {
            char p = sc.next().charAt(0);
            int score = sc.nextInt();

            if (p == 'A') aScore += score;
            else if (p == 'B') bScore += score;
            else cScore += score;

            int max = Math.max(aScore, Math.max(bScore, cScore));

            boolean isChange = false;
            if (aScore == max) {
                if (!isFirst[0]) {
                    isFirst[0] = true;
                    isChange = true;
                }
            } else {
                if (isFirst[0]) {
                    isFirst[0] = false;
                    isChange = true;
                }
            }

            if (bScore == max) {
                if (!isFirst[1]) {
                    isFirst[1] = true;
                    isChange = true;
                }
            } else {
                if (isFirst[1]) {
                    isFirst[1] = false;
                    isChange = true;
                }
            }

            if (cScore == max) {
                if (!isFirst[2]) {
                    isFirst[2] = true;
                    isChange = true;
                }
            } else {
                if (isFirst[2]) {
                    isFirst[2] = false;
                    isChange = true;
                }
            }

            if (isChange) ans++;
        }

        System.out.print(ans);
    }
}