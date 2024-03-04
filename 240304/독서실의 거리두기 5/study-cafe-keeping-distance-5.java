import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] line = new int[N];
        char[] list = sc.next().toCharArray();

        for (int i = 0; i < N; i++) {
            line[i] = list[i] - '0';
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (line[i] == 0) {

                line[i] = 1;

                int min = Integer.MAX_VALUE;
                int prev = -1;
                int cur = -1;

                for (int k = 0; k < N; k++) {
                    if (line[k] == 1) {
                        if (cur == -1) cur = k;
                        else {
                            min = Math.min(min, Math.abs(k - cur));
                            prev = cur;
                            cur = k;
                        }
                    }
                }

                ans = Math.max(ans, min);

                line[i] = 0;
            }
        }

        System.out.print(ans);
    }
}