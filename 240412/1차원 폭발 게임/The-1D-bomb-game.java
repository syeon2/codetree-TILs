import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N];

        boolean bombed = true;

        while (bombed) {
            bombed = false;

            int idx = 0;
            int value = list[0];

            for (int i = 1; i < N; i++) {
                if (list[i] == value) continue;
                else {
                    if (i - idx >= M) {
                        for (int k = idx; k < i; k++) {
                            list[k] = 0;
                        }

                        bombed = true;
                    }

                    idx = i;
                    value = list[i];
                }
            }

            if (N - idx + 1>= M) {
                for (int i = idx; i < N; i++) {
                    list[i] = 0;
                }

                bombed = true;
            }

            int[] memo = new int[101];
            idx = 0;
            for (int i = 0; i < N; i++) {
                if (list[i] > 0) memo[idx++] = list[i];
            }

            list = memo;
            N = idx;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(N).append("\n");

        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb);
    }
}