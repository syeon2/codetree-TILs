import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        int[] list = new int[M + 1];
        Arrays.fill(list, -1);

        list[0] = 0;

        for (int i = 1; i <= M; i++) {
            int min = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (i - coin[k] >= 0 && list[i - coin[k]] != Integer.MAX_VALUE) {
                    min = Math.min(min, list[i - coin[k]]);
                }
            }

            list[i] = min + 1;
        }

        if (list[M] == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(list[M]);
    }
}