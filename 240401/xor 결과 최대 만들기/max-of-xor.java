import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[] list;
    public static int[] ansList;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        list = new int[N];
        ansList = new int[M];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        recur(0, 0);

        System.out.print(ans);
    }

    public static void recur(int idx, int depth) {
        if (depth >= M) {
            int temp = ansList[0];

            for (int i = 1; i < M; i++) {
                temp ^= ansList[i];
            }

            ans = Math.max(ans, temp);
            return;
        }

        for (int i = idx; i < N; i++) {
            ansList[depth] = list[i];
            recur(i + 1, depth + 1);
        }
    }
}