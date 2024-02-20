import java.util.Scanner;

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
            int x1 = list[i][0];
            int y1 = list[i][1];

            for (int k = i + 1; k < N; k++) {
                int x2 = list[k][0];
                int y2 = list[k][1];

                int disc = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

                ans = Math.min(ans, disc);
            }
        }

        System.out.print(ans);
    }
}