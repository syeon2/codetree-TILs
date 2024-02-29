import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        
        int[] comp = new int[M];
        for (int i = 0; i < M; i++) {
            comp[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] valueList = new int[101];

            for (int k = 0; k < M; k++) {
                int idx = comp[k];

                valueList[idx] += 1;
            }

            boolean flag = true;
            for (int k = i; k < i + M; k++) {
                int idx = list[k];

                valueList[idx] -= 1;

                if (valueList[idx] < 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }
}