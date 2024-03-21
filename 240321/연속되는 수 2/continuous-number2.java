import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = 0;

        int cnt = 0;
        int curValue = -1;

        for (int n = 0; n < N; n++) {
            int num = sc.nextInt();

            if (num != curValue) {
                curValue = num;
                cnt = 1;
            } else {
                cnt++;

                if (cnt > ans) ans = cnt;
            }
        }

        System.out.print(ans);
    }
}