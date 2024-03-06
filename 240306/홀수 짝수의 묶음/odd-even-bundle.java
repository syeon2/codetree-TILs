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

        int even = 0;
        int odd = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] % 2 == 1) odd++;
            else even++;
        }

        boolean isEven = true;

        int ans = 0;

        while (true) {
            // 짝수 턴이면서 even이 0이상일 경우
            boolean flag = false;

            if (isEven && even > 0) {
                isEven = false;
                even--;
                flag = true;
            } else if (isEven && (even == 0 && odd >= 2)) { // 짝수 턴이면서 even 카운트를 다 소모하고 odd 카운트에 2개 이상 남아있을 때
                isEven = false;
                odd -= 2;
                flag = true;
            } else if (!isEven && odd > 0) {
                isEven = true;
                odd--;
                flag = true;
            }

            if (flag) ans++;
            else {
                if (isEven && odd == 1) ans--;

                break;
            }
        }

        System.out.print(ans);
    }
}