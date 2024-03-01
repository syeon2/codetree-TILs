import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int temp = B;

            for (int k = 0; k < N; k++) {
                if (i == k) temp -= list[k] / 2;
                else temp -= list[k];

                if (temp < 0) {
                    ans = Math.max(ans, k);
                    break;
                }
            }
        }

        System.out.print(ans);
    }
}