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
        for (int i = 0; i < N; i += list[i]) {

            for (int k = i; k < i + list[i]; k++) {
                if (k >= N || list[i] != list[k]) return false;
            }
        }

        return true;
    }
}