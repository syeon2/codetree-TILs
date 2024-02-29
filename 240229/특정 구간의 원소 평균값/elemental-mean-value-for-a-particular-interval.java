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

                int temp = 0;
                int cnt = 0;
                for (int start = k; start < k + i; start++) {
                    temp += list[start];
                    cnt++;
                }

                double avg = (double) temp / cnt;

                for (int start = k; start < k + i; start++) {
                    if (avg == list[start]) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}