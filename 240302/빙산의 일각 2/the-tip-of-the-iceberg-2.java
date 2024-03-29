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
        for (int i = 0; i < height; i++) {

            int cnt = 0;
            boolean isLand = false;

            for (int k = 0; k < N; k++) {
                if (list[k] - i > 0 && !isLand) {
                    cnt++;
                    isLand = true;
                } else if (list[k] - i <= 0) isLand = false;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}