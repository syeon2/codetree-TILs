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

        for (int y = 2; y <= 100; y += 2) {

            for (int x = 2; x <= 100; x += 2) {

                int one = 0; // x+, y+
                int two = 0; // x-, y+
                int three = 0; // x-, y-
                int four = 0; // x+, y-

                for (int i = 0; i < N; i++) {
                    int xPos = list[i][0];
                    int yPos = list[i][1];

                    if (xPos > x && yPos > y) one++;
                    else if (xPos < x && yPos > y) two++;
                    else if (xPos < x && yPos < y) three++;
                    else four++;
                }

                int max = Math.max(Math.max(one, two), Math.max(three, four));

                ans = Math.min(ans, max);
            }
        }

        System.out.print(ans);
    }
}