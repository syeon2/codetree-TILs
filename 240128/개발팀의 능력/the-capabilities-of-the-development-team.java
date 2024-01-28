import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int a = 0; a < 5; a++) {
            
            for (int b = 0; b < 5; b++) {
                if (a == b) continue;

                for (int c = 0; c < 5; c++) {
                    if (a == c || b == c) continue;

                    for (int d = 0; d < 5; d++) {
                        if (a == d || b == d || c == d) continue;

                        for (int e = 0; e < 5; e++) {
                            if (a == e || b == e || c == e || d == e) continue;

                            int team1 = list[a] + list[b];
                            int team2 = list[c] + list[d];
                            int team3 = list[e];

                            if (team1 == team2 || team2 == team3 || team1 == team3) continue;

                            int max = Math.max(team1, Math.max(team2, team3));
                            int min = Math.min(team1, Math.min(team2, team3));

                            ans = Math.min(ans, max - min);
                        }
                    }
                }
            }
        }

        if (ans = Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(ans);
    }
}