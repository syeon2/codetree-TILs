import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        String str = sc.next();

        for (int i = 0; i < N; i++) {
            list[i] = str.charAt(i) - '0';
        }

        int[] memoGap = new int[N + 1];

        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (list[i] == 1 && prev == -1) prev = i;
            else if (list[i] == 1) {
                int idx = i - prev;

                memoGap[idx]++;
                prev = i;
            }
        }

        int cnt = 0;
        int gap = 0;

        int minGap = -1;

        for (int i = 0; i < N; i++) {
            if (memoGap[i] >= 1) {
                cnt = memoGap[i];
                gap = i;

                if (minGap == -1) minGap = i;
            }
        }

        System.out.print(Math.min(minGap, gap / 2));
    }
}