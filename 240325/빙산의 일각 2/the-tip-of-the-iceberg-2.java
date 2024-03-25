import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] land = new int[N];
        for (int i = 0; i < N; i++) {
            land[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i <= 1000; i++) {
            int cnt = 0;
            boolean isLand = false;

            for (int k = 0; k < N; k++) {
                if (!isLand && i < land[k]) {
                    isLand = true;
                    cnt++;
                } else if (i >= land[k]) isLand = false;
            }

            if (ans < cnt) ans = cnt;
        }

        System.out.print(ans);
    }
}