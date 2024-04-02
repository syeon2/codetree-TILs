import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static List<List<Integer>> list = new ArrayList<>();
    public static boolean[] isVisit;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        isVisit = new boolean[N];

        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        for (int m = 0; m < M; m++) {
            int s = sc.nextInt() - 1;
            int e = sc.nextInt() - 1;

            list.get(s).add(e);
            list.get(e).add(s);
        }

        isVisit[0] = true;
        dfs(0);

        System.out.print(ans);
    }

    public static void dfs(int node) {
        List<Integer> arr = list.get(node);

        for (int i = 0; i < arr.size(); i++) {
            int nextNode = arr.get(i);

            if (isVisit[nextNode]) continue;
            else {
                isVisit[nextNode] = true;
                ans++;
                dfs(nextNode);
            }
        }
    }
}