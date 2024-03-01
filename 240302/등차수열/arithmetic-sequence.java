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

        int[] nums = new int[101];

        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                if ((list[i] + list[k]) % 2 == 1) continue;

                int idx = (list[i] + list[k]) / 2;

                nums[idx]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < 101; i++) {
            ans = Math.max(ans, nums[i]);
        }

        System.out.print(ans);
    }
}