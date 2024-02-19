import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();

            total += list[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 5; k++) {
                if (i == k) continue;

                int team1 = list[i] + list[k];

                for (int j = 0; j < 5; j++) {

                    if (j == i || j == k) continue;

                    for (int l = 0; l < 5; l++) {

                        if (l == i || l == k || l == j) continue;

                        int team2 = list[j] + list[l];

                        int team3 = total - (team1 + team2);

                        int max = Math.max(team1, Math.max(team2, team3));
                        int min = Math.min(team1, Math.min(team2, team3));

                        if (team1 != team2 && team2 != team3) {
                            ans = Math.min(ans, max - min);
                        }
                    }
                }
            }
        }

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }
}