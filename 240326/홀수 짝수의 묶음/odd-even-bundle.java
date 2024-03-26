import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int odd = 0; // 홀
        int even = 0; // 짝

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            if (list[i] % 2 == 1) odd++;
            else even++;
        }

        int ans = 0;

        int idx = 1;
        while (true) {
            if (idx % 2 == 1) {
                if (even > 0) {
                    even--;
                    ans++;
                } else if (odd >= 2) {
                    odd -= 2;
                    ans++;
                } else if (odd == 0) break;
                else {
                    ans--;
                    break;
                }
            } else {
                if (odd > 0) {
                    odd--;
                    ans++;
                } else break;
            }

            idx++;
        }

        System.out.print(ans);
    }
}