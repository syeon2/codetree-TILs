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

        while (true) {
            boolean explosion = false;

            int value = 0;
            int prevIdx = 0;

            for (int i = 0; i < N; i++) {
                if (i == 0) value = list[i];
                else {
                    if (value != list[i]) {
                        if ((i - 1) - prevIdx + 1 >= M) {
                            explosion = true;

                            for (int k = prevIdx; k < i; k++) {
                                list[k] = 0;
                            }
                        }

                        value = list[i];
                        prevIdx = i;
                    }
                }
            }

            if (value == list[N - 1] && (N - 1 - prevIdx + 1) >= M) {
                for (int i = prevIdx; i < N; i++) {
                    list[i] = 0;
                }
            }

            for (int i = 0; i < N; i++) {
                if (list[i] != 0) continue;

                for (int k = i + 1; k < N; k++) {
                    if (list[k] != 0) {
                        list[i] = list[k];
                        list[k] = 0;
                        break;
                    }
                }
            }

            if (!explosion) break;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] != 0) ans++;
            else break;
        }

        System.out.println(ans);
        for (int i = 0; i < N; i++) {
            if (list[i] != 0) System.out.println(list[i]);
            else break;
        }
    }
}