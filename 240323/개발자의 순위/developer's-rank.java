import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[][] list = new int[K][N];
        for (int i = 0; i < K; i++) {
            for (int k = 0; k < N; k++) {
                list[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                if (i == k) continue;

                boolean flag = true;

                for (int j = 0; j < K; j++) {
                    int idx1 = 0;
                    int idx2 = 0;

                    for (int l = 0; l < N; l++) {
                        if (list[j][l] == i) idx1 = l;
                        else if (list[j][l] == k) idx2 = l;
                    }

                    if (idx1 > idx2) flag = false;
                }

                if (flag) ans++;
            }
        }

        System.out.print(ans);
    }
}