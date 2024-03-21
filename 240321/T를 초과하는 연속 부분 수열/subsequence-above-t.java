import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num > K) {
                cnt++;

                if (ans < cnt) ans = cnt;
            } else {
                cnt = 0;
            }
        }

        System.out.print(ans);
    }
}