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

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            list[i] *= 2;

            for (int k = 0; k < N; k++) {
                int prev = 0;
                int sum = 0;

                for (int j = 0; j < N; j++) {
                    if (k == j) continue;

                    if (prev == 0) prev = list[j];
                    else {
                        sum += Math.abs(prev - list[j]);
                        prev = list[j];
                    }
                }

                if (ans > sum) ans = sum;
            }

            list[i] /= 2;
        }

        System.out.print(ans);
    }
}