import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int x = 0; x < 101; x++) {
            for (int y = 0; y < 101; y++) {
                int first = 0;
                int second = 0;
                int third = 0;
                int fourth = 0;

                for (int n = 0; n < N; n++) {
                    int nx = list[n][0];
                    int ny = list[n][1];

                    if (nx > x && ny > y) first++;
                    else if (nx < x && ny > y) second++;
                    else if (nx < x && ny < y) third++;
                    else fourth++;
                }

                int max = Math.max(Math.max(first, second), Math.max(third, fourth));

                ans = Math.min(ans, max);
            }
        }

        System.out.print(ans);
    }
}