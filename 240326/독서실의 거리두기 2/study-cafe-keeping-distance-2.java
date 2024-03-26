import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] list = sc.next().toCharArray();

        int max = 0;
        int min = 1001;

        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (list[i] == '0') continue;

            if (prev == -1) prev = i;
            else {
                int dist = i - prev;

                max = Math.max(max, dist);
                min = Math.min(min, dist);
                prev = i;
            }
        }

        int middle = Math.min(max / 2, min);

        int right = 0;
        int left = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] == '0') right++;
            else break;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (list[i] == '0') left++;
            else break;
        }

        int ans = Math.max(middle, Math.max(right - 1, left - 1));

        System.out.print(ans);
    }
}