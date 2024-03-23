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

        int ans = -1;

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (i == k) continue;

                for (int j = 0; j < 5; j++) {
                    if (i == j || k == j) continue;

                    for (int l = 0; l < 5; l++) {
                        if (i == l || k == l || j == l) continue;

                        int team1 = list[i] + list[k];
                        int team2 = list[j] + list[l];
                        int team3 = total - team1 - team2;

                        if (team1 == team2 || team1 == team3 || team2 == team3) continue;

                        int max = Math.max(team1, Math.max(team2, team3));
                        int min = Math.min(team1, Math.min(team2, team3));

                        ans = Math.min(ans, max - min);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}