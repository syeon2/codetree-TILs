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

            for (int k = 0; k < N; k++) {

                if (i == k) continue;

                int distX = Math.abs(list[i][0] - list[k][0]);
                int distY = Math.abs(list[i][1] - list[k][1]);

                ans = Math.min(ans, (distX * distX) + (distY * distY));
            }
        }

        System.out.print(ans);
    }
}