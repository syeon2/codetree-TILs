import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int total = 0;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            total += list[i];
        }

        int avg = total / M;
        int ans = 0;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (Math.abs(sum + list[i] - avg) <= Math.abs(sum - avg)) {
                sum += list[i];
                ans = Math.max(ans, sum);
            } else if (M > 0) {
                M--;
                sum = list[i];
            }
        }

        ans = Math.max(ans, sum);

        System.out.print(ans);
    }
}