import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[][] grid;
    public static boolean[] visited;

    public static int ans = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        while (M-- > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            grid[n1][n2] = 1;
            grid[n2][n1] = 1;
        }

        dfs(1);

        System.out.print(ans);
    }

    public static void dfs(int node) {
        if (visited[node]) return;

        visited[node] = true;
        ans++;

        for (int i = 1; i <= N; i++) {
            if (grid[node][i] == 1) dfs(i);
        }
    }
}