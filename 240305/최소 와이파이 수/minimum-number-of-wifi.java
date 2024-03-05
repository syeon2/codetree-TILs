import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int curIdx = 0;
        int ans = 0;

        while (curIdx < N) {
            if (list[curIdx] == 1) {
                ans++;
                curIdx += (2 * K) + 1;
            } else {
                curIdx++;
            }
        }

        System.out.print(ans);
    }
}