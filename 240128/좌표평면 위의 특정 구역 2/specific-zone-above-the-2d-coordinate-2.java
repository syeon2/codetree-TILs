import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // x, y
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            list[i][0] = n1;
            list[i][1] = n2;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {

            int maxX = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;

            int maxY = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                maxX = Math.max(maxX, list[k][0]);
                minX = Math.min(minX, list[k][0]);

                maxY = Math.max(maxY, list[k][1]);
                minY = Math.min(minY, list[k][1]);
            }

            int width = Math.abs(maxX - minX);
            int height = Math.abs(maxY - minY);

            ans = Math.min(ans, width * height);
        }

        System.out.print(ans);
    }
}