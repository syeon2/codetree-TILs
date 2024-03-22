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
        for (int i = 1; i <= N; i++) {

            for (int k = 0; k <= N - i; k++) {
                int sum = 0;

                for (int j = k; j < k + i; j++) {
                    sum += list[j];
                }

                double avg = (double) sum / i;

                for (int j = k; j < k + i; j++) {
                    if (list[j] == avg) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}