import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] list = sc.next().toCharArray();

        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] == '1') continue;
            list[i] = '1';

            int prev = -1;
            int minDist = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (list[k] == '1') {
                    if (prev == -1) prev = k;
                    else {
                        int dist = k - prev;
                        minDist = Math.min(minDist, dist);
                        prev = k;
                    }
                }
            }

            ans = Math.max(ans, minDist);

            list[i] = '0';
        }

        System.out.print(ans);
    }
}