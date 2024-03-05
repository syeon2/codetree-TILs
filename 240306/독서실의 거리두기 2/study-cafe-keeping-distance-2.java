import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = str.charAt(i) - '0';
        }

        int prev = -1;
        int maxGap = 0;
        int minGap = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (list[i] == 1) {
                if (prev == -1) prev = i;
                else {
                    int gap = i - prev;

                    maxGap = Math.max(maxGap, gap);
                    minGap = Math.min(minGap, gap);

                    prev = i;
                }
            }
        }

        int firstGap = 0;
        int lastGap = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] == 0) firstGap++;
            else break;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (list[i] == 0) lastGap++;
            else break;
        }

        if (maxGap / 2 < Math.max(firstGap, lastGap)) {
            maxGap = Math.max(firstGap, lastGap);
        } else {
            maxGap /= 2;
        }

        int ans = Math.min(maxGap, minGap);

        System.out.print(ans);
    }
}