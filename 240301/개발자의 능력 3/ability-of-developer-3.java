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
            for (int k = i + 1; k < 6; k++) {
                for (int j = k + 1; j < 6; j++) {
                    int team1 = list[i] + list[k] + list[j];
                    int team2 = total - team1;

                    ans = Math.min(ans, Math.abs(team1 - team2));
                }
            }
        }

        System.out.print(ans);
    }
}