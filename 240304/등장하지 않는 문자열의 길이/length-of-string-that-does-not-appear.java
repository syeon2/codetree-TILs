import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int ans = 0;

        int cnt = 1;

        for (int i = 1; i <= N; i++) {
            boolean flag = false;

            for (int k = 0; k <= N - i; k++) {
                String subStr = str.substring(k, k + i);

                if (str.indexOf(subStr, k + 1) != -1) flag = true;
            }

            if (!flag) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}