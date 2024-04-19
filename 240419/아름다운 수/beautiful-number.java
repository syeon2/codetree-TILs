import java.util.*;

public class Main {

    public static int N;
    public static int[] list;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N];

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == N) {
            if (isBeautifulNum()) ans++;

            return;
        }

        for (int i = 1; i <= 4; i++) {
            list[depth] = i;
            perm(depth + 1);
        }
    }

    public static boolean isBeautifulNum() {
        int idx = 0;

        while (idx < N) {
            int num = list[idx];

            for (int i = idx; i < idx + num; i++) {
                if (i >= N || list[idx] != list[i]) return false;
            }

            idx += num;
        }

        return true;
    }
}