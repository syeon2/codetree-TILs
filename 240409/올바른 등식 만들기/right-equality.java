import java.util.*;

public class Main {

    public static int OFFSET = 20;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int[][] memo = new int[N][41];

        memo[0][list[0] + OFFSET]++;
        memo[0][(list[0] * -1) + OFFSET]++;

        for (int i = 1; i < N; i++) {

            int value = list[i];

            for (int k = 0; k <= 40; k++) {
                if (memo[i - 1][k] > 0) {
                    if (k - value >= 0) memo[i][k - value] += memo[i - 1][k];
                    if (k + value <= 40) memo[i][k + value] += memo[i - 1][k];
                }
            }
        }

        System.out.print(memo[N - 1][M + OFFSET]);
    }
}