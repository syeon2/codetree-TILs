import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= N - T; i++) {

            int pay = 0;
            for (int start = i; start < i + T; start++) {
                int temp = Math.abs(list[start] - H);

                pay += temp;
            }

            ans = Math.min(ans, pay);
        }

        System.out.print(ans);
    }
}