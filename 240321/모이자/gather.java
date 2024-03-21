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

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int k = 0; k < N; k++) {
                sum += Math.abs(i - k) * list[k];
            }

            ans = Math.min(ans, sum);
        }

        System.out.println(ans);
    }
}