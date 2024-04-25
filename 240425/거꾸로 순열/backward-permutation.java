import java.util.*;

public class Main {

    public static int N;
    public static int[] memo;
    public static boolean[] visited;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        memo = new int[N];
        visited = new boolean[N];

        perm(0);

        System.out.print(sb);
    }

    public static void check() {
        for (int i = 0; i < N; i++) {
            sb.append(memo[i]).append(" ");
        }

        sb.append("\n");
    }

    public static void perm(int depth) {
        if (depth == N) {
            check();
            return;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (visited[i]) continue;

            visited[i] = true;
            memo[depth] = i + 1;
            perm(depth + 1);
            visited[i] = false;
        }
    }
}