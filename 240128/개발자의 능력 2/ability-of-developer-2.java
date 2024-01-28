import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[6];

        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int a = 0; a < 6; a++) {

            for (int b = 0; b < 6; b++) {
                if (a == b) continue;

                for (int c = 0; c < 6; c++) {
                    if (a == c || b == c) continue;

                    for (int d = 0; d < 6; d++) {
                        if (a == d || b == d || c == d) continue;

                        for (int e = 0; e < 6; e++) {
                            if (a == e || b == e || c == e || d == e) continue;

                            for (int f = 0; f < 6; f++) {
                                if (a == f || b == f || c == f || d == f || e == f) continue;

                                int team1 = list[a] + list[b];
                                int team2 = list[c] + list[d];
                                int team3 = list[e] + list[f];

                                int max = Math.max(team1, Math.max(team2, team3));
                                int min = Math.min(team1, Math.min(team2, team3));

                                ans = Math.min(ans, max - min);
                            }
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}