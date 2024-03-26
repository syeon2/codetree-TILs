import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = N; i >= Math.min(list[0], list[list.length - 1]); i--) {
            if (isPossible(i, list, K)) {
                ans = Math.min(ans, i);
            }
        }

        System.out.print(ans);
    }

    public static boolean isPossible(int n, int[] list, int K) {
        int[] arr = new int[list.length];
        int cnt = 0;

        for (int i = 0; i < list.length; i++) {
            if (n >= list[i]) arr[cnt++] = i;
        }

        for (int i = 1; i < cnt; i++) {
            int dist = arr[i] - arr[i - 1];

            if (dist > K) return false;
        }

        if (cnt <= 1) return false;

        return true;
    }
}