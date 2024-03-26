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

        int left = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] == '0') left++;
            else break;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (list[i] == '0') right++;
            else break;
        }

        if (min == max) {
            if (min / 2 <= Math.max(left, right)) {
                System.out.print(Math.max(left, right));
            } else System.out.print(min / 2);
        } else {
            int middle = Math.max(max / 2, Math.max(right, left));

            System.out.print(Math.min(min, middle));
        }
    }
}