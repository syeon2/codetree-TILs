import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int[] memo = new int[N];
        memo[0] = 1;

        for (int i = 1; i < N; i++) {
            int max = 0;

            for (int k = 0; k < i; k++) {
                if (list[i] < list[k]) {
                    max = Math.max(max, memo[k]);
                }
            }

            memo[i] = max + 1;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, memo[i]);
        }

        System.out.print(ans);
    }
}