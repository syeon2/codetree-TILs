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

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                if (i == k) continue;

                boolean flag = true;

                for (int j = 0; j < K; j++) {
                    int iIdx = 0;
                    int kIdx = 0;

                    for (int l = 0; l < N; l++) {
                        if (list[j][l] == i) iIdx = l;
                        else if (list[j][l] == k) kIdx = l;
                    }

                    if (iIdx > kIdx) flag = false;
                }

                if (flag) cnt++;
            }
        }

        System.out.print(cnt);
    }
}