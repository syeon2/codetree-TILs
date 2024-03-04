import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            
            int sum = 0;

            int cnt = M;
            int curPos = i;
            while (cnt-- > 0) {
                int nextIdx = list[curPos];

                sum += nextIdx;
                curPos = nextIdx;
            }

            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }
}