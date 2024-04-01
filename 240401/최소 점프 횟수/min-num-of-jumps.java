import java.util.*;

public class Main {

    public static int N;
    public static int[] list;

    public static int ans = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        permutation(0, 0);

        System.out.print(ans);
    }

    public static void permutation(int idx, int cnt) {
        if (idx > N - 1) return;
        else if (idx == N - 1) {
            if (ans == -1) ans = cnt;
            else ans = Math.min(ans, cnt);
            
            return;
        }

        int jump = list[idx];
        for (int i = 1; i <= jump; i++) {
            permutation(idx + i, cnt + 1);
        }
    }
}