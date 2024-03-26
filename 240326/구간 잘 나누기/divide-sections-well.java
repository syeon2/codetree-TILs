import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 1; i <= 10000; i++) {
            int target = i;
            int cnt = M - 1;

            int sum = 0;
            boolean flag = true;

            for (int k = 0; k < N; k++) {
                if (sum + list[k] > target) {
                    cnt--;
                    sum = list[k];
                } else sum += list[k];

                if (cnt < 0 || sum > target) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}