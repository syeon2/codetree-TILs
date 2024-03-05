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
            int min = Integer.MAX_VALUE;
            int minIdx = 0;

            int max = Integer.MIN_VALUE;
            int maxIdx = 0;

            for (int i = 0; i < N; i++) {
                if (list[i] < min) {
                    min = list[i];
                    minIdx = i;
                }

                if (list[i] > max) {
                    max = list[i];
                    maxIdx = i;
                }
            }

            if (min == max) break;
            else {
                list[maxIdx]--;
                list[minIdx]++;
                ans++;
            }
        }

        System.out.print(ans);
    }
}