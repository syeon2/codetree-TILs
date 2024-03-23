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

        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                for (int j = 0; j < N; j++) {
                    if (i == j || k == j) continue;

                    int centerX = list[i][0];
                    int centerY = list[i][1];

                    if (centerX == list[k][0] && centerY == list[j][1] && list[k][0] != list[j][0] && list[k][1] != list[j][1]) {
                        int width = Math.abs(centerX - list[j][0]);
                        int height = Math.abs(centerY - list[k][1]);

                        ans = Math.max(ans, width * height);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}