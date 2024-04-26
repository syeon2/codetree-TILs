import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static List<List<Integer>> list = new ArrayList<>();
    public static boolean[] visited;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        while (M-- > 0) {
            int n1 = sc.nextInt() - 1;
            int n2 = sc.nextInt() - 1;

            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }

        visited[0] = true;
        dfs(0);

        System.out.print(ans);
    }

    public static void dfs(int node) {
        List<Integer> nodeList = list.get(node);

        for (int i = 0; i < nodeList.size(); i++) {
            int nextNode = nodeList.get(i);

            if (visited[nextNode]) continue;

            visited[nextNode] = true;
            ans++;
            dfs(nextNode);
        }
    }
}