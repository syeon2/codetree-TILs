import java.util.Scanner;

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

        int sub = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {

            for (int k = 0; k < 6; k++) {
                if (i == k) continue;

                int team1 = list[i] + list[k];

                for (int j = 0; j < 6; j++) {
                    if (i == j || i == k) continue;

                    for (int l = j + 1; l < 6; l++) {

                        if (i == l || k == l || j == l) continue;

                        int team2 = list[j] + list[l];

                        int team3 = total - (team1 + team2);

                        int max = Math.max(team1, Math.max(team2, team3));
                        int min = Math.min(team1, Math.min(team2, team3));

                        sub = Math.min(sub, max - min);
                    }
                }
            }
        }

        System.out.print(sub);
    }
}