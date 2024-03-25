import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int idx = i;

            int cnt = M;

            while (cnt > 0) {
                cnt--;
                sum += list[idx];
                idx = list[idx];
            }

            if (ans < sum) ans = sum;
        }

        System.out.print(ans);
    }
}