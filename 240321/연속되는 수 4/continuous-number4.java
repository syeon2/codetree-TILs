import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = 1;
        int cnt = 1;
        int curValue = sc.nextInt();

        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();

            if (curValue < num) {
                cnt++;
                curValue = num;

                if (ans < cnt) ans = cnt;
            } else {
                cnt = 1;
                curValue = num;
            }
        }

        System.out.print(ans);
    }
}