import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        int[] shakeHandsTime = new int[N + 1];
        Arrays.fill(shakeHandsTime, K);

        int[][] situation = new int[251][2];
        boolean[] isInfected = new boolean[N + 1];
        isInfected[P] = true;

        for (int t = 0; t < T; t++) {
            int seconds = sc.nextInt();
            int xPerson = sc.nextInt();
            int yPerson = sc.nextInt();

            situation[seconds][0] = xPerson;
            situation[seconds][1] = yPerson;
        }

        for (int i = 1; i < situation.length; i++) {
            int xPerson = situation[i][0];
            int yPerson = situation[i][1];

            if (xPerson == 0 || yPerson == 0) continue;

            if ((isInfected[xPerson] && shakeHandsTime[xPerson] > 0) || (isInfected[yPerson] && shakeHandsTime[yPerson] > 0)) {
                if (!isInfected[xPerson]) isInfected[xPerson] = true;
                else shakeHandsTime[xPerson]--;

                if (!isInfected[yPerson]) isInfected[yPerson] = true;
                else shakeHandsTime[yPerson]--;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (isInfected[i]) System.out.print(1);
            else System.out.print(0);
        }
    }
}