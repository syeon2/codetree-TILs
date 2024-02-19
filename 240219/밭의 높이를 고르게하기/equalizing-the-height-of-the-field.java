import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();

        int[] land = new int[N];
        for (int i = 0; i < N; i++) {
            land[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= N - T; i++) {
            int cost = 0;

            for (int k = i; k < i + T; k++) {
                cost += Math.abs(H - land[k]);
            }

            ans = Math.min(ans, cost);
        }

        System.out.print(ans);
    }
}