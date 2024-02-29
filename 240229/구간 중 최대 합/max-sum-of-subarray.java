import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i <= N - K; i++) {

            int temp = 0;
            for (int k = i; k < i + K; k++) {
                temp += list[k];
            }

            if (ans < temp) ans = temp;
        }

        System.out.print(ans);
    }
}