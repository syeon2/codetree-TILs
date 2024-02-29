import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int[] list = new int[6];
        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextInt();

            total += list[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {

            for (int k = 0; k < 6; k++) {
                if (i == k) continue;

                for (int l = 0; l < 6; l++) {
                    if (i == l || k == l) continue;

                    for (int x = 0; x < 6; x++) {
                        if (i == x || k == x || l == x) continue;
                        
                        int team1 = list[i] + list[k];
                        int team2 = list[l] + list[x];
                        int team3 = total - team1 - team2;

                        int maxTeam = Math.max(team1, Math.max(team2, team3));
                        int minTeam = Math.min(team1, Math.min(team2, team3));

                        ans = Math.min(ans, maxTeam - minTeam);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}