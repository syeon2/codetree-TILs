import java.util.*;

public class Main {

    public static int total = 0;
    public static int N;

    public static int[] list;
    public static int[] ansList;

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N * 2];
        ansList = new int[N];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            total += list[i];
        }

        recur(0, 0);

        System.out.print(ans);
    }

    public static void recur(int idx, int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i = 0; i < ansList.length; i++) {
                sum += ansList[i];
            }

            int sum2 = total - sum;

            ans = Math.min(ans, Math.abs(sum - sum2));

            return;
        }

        for (int i = idx; i < N * 2; i++) {
            ansList[depth] = list[i];
            recur(i + 1, depth + 1);
        }
    }
}