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

            for (int k = i + 1; k < N; k++) {
                int width = Math.abs(list[k][0] - list[i][0]);
                int height = Math.abs(list[k][1] - list[i][1]);

                ans = Math.min(ans, width * width + height * height);
            }
        }

        System.out.print(ans);
    }
}