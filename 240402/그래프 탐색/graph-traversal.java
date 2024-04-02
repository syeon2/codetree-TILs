import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] arr;
    public static boolean[] isVisit;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][N];
        isVisit = new boolean[N];
        for (int m = 0; m < M; m++) {
            int s = sc.nextInt() - 1;
            int e = sc.nextInt() - 1;

            arr[s][e] = 1;
            arr[e][s] = 1;
        }

        dfs(0);

        System.out.print(ans);
    }

    public static void dfs(int node) {
        isVisit[node] = true;

        for (int i = 0; i < N; i++) {
            if (isVisit[i]) continue;
            else {
                if (arr[node][i] == 1) {
                    dfs(i);
                    ans++;
                    return;
                }
            }
        }
    }
}