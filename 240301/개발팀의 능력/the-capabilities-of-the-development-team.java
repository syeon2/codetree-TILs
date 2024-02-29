import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();

            total += list[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 5; k++) {
                if (i == k) continue;

                for (int j = 0; j < 5; j++) {
                    if (i == j || k == j) continue;

                    for (int x = 0; x < 5; x++) {
                        if (i == x || k == x || j == x) continue;

                        int team1 = list[i] + list[k];
                        int team2 = list[j] + list[x];
                        int team3 = total - team1 - team2;

                        if (team1 != team2 && team2 != team3 && team1 != team3) {
                            int maxTeam = Math.max(team1, Math.max(team2, team3));
                            int minTeam = Math.min(team1, Math.min(team2, team3));

                            ans = Math.min(ans, maxTeam - minTeam);
                        }
                    }
                }
            }
        }

        if (ans == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }
}