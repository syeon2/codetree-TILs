import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        while (true) {
            if (list[0] == N) {
                int num = list[0];

                for (int i = 1; i < N; i++) {
                    list[i - 1] = list[i];
                }

                list[N - 1] = num;
                ans++;
            } else {
                int num = list[0];

                int idx = 0;
                for (int i = 1; i < N; i++) {
                    list[i - 1] = list[i];

                    if (list[i] == N) {
                        idx = i;
                        break;
                    }
                }

                for (int i = idx + 1; i < N; i++) {
                    if (list[i] > num) {
                        list[i - 1] = num;
                        ans++;
                        break;
                    } else if (i == N - 1) {
                        list[i] = num;
                        ans++;
                        break;
                    } else list[i - 1] = list[i];
                }
            }

            boolean flag = true;
            for (int i = 1; i < N; i++) {
                if (list[i - 1] > list[i]) flag = false;
            }

            if (flag) break;
        }

        System.out.print(ans);
    }
}