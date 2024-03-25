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

        int ans = 0;

        for (int i = 1; i <= 100; i++) {

            int pivot = i;
            int cnt = 0;

            for (int k = 0; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    int frontGap = list[k] - pivot;
                    int backGap = pivot - list[j];

                    if (frontGap == backGap) cnt++;
                }
            }

            if (ans < cnt) ans = cnt;
        }

        System.out.print(ans);
    }
}