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
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                int x1 = list[i][0];
                int y1 = list[i][1];

                int x2 = list[k][0];
                int y2 = list[k][1];

                int doubleWidth = (x1 - x2) * (x1 - x2);
                int doubleHeight = (y1 - y2) * (y1 - y2);

                ans = Math.min(ans, doubleWidth + doubleHeight);
            }
        }

        System.out.print(ans);
    }
}