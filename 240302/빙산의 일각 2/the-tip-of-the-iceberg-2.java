import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        int height = 0;
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            height = Math.max(height, list[i]);
        }

        int ans = 0;

        for (int i = 0; i <= height; i++) {

            int cnt = 0;

            for (int k = 1; k < list.length; k++) {
                if (list[k - 1] - i <= 0 && list[k] - i > 0) cnt++;
            }

            if (list[N - 1] - i > 0) cnt++;

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}