import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] list = new int[M][2];

        for (int i = 0; i < M; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            for (int k = i + 1; k <= N; k++) {
                int a = i;
                int b = k;

                int temp = 0;
                for (int j = 0; j < M; j++) {
                    if ((list[j][0] == a && list[j][1] == b) || (list[j][0] == b && list[j][1] == a)) temp++;
                }

                ans = Math.max(ans, temp);
            }
        }

        System.out.print(ans);
    }
}