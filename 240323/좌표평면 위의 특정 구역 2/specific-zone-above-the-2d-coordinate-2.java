import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {

            int minX = 40001;
            int minY = 40001;

            int maxX = 0;
            int maxY = 0;

            for (int k = 0; k < N; k++) {
                if (k == i) continue;

                minX = Math.min(minX, list[k][0]);
                minY = Math.min(minY, list[k][1]);

                maxX = Math.max(maxX, list[k][0]);
                maxY = Math.max(maxY, list[k][1]);
            }

            int width = maxX - minX;
            int height = maxY - minY;

            ans = Math.min(ans, width * height);
        }

        System.out.print(ans);
    }
}