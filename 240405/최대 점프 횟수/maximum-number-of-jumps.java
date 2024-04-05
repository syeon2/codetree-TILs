import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        boolean[] fromFirst = new boolean[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int[] memo = new int[N];
        fromFirst[0] = true;

        for (int i = 1; i < N; i++) {

            int max = 0;
            for (int k = 0; k < i; k++) {
                if (k + list[k] >= i && fromFirst[k]) {
                    max = Math.max(max, memo[k] + 1);
                }
            }

            if (max != 0) {
                memo[i] = max;
                fromFirst[i] = true;
            }
        }

        System.out.print(memo[N - 1]);
    }
}