import java.util.*;

public class Main {

    public static int N;
    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            takeOut(start, end);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(N).append("\n");

        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb);
    }

    public static void takeOut(int s, int e) {
        int idx = 0;

        int[] memo = new int[N];
        for (int i = 0; i < N; i++) {
            if (i >= s && i <= e) continue;
            else memo[idx++] = list[i];
        }

        list = memo;
        N = idx;
    }
}