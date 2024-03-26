import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            int[] temp = new int[N];
            for (int k = 0; k < N; k++) {
                temp[k] = list[k];
            }

            int pivot = i;
            int cnt = 0;

            int tempL = L;

            for (int k = N - 1; k >= 0; k--) {
                if (pivot > temp[k] && tempL != 0) {
                    tempL -= 1;
                    temp[k] += 1;
                }
            }

            for (int k = 0; k < N; k++) {
                if (pivot <= temp[k]) cnt++;
            }

            if (pivot <= cnt) ans = Math.max(ans, pivot);
        }

        System.out.print(ans);
    }
}