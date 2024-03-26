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
        for (int i = 0; i <= 100; i++) {
            int totalCost = 0;
            int minHeight = i;

            for (int k = 0; k < N; k++) {
                int curHeight = list[k];

                if (minHeight <= curHeight && curHeight <= minHeight + 17) continue;
                else if (minHeight > curHeight) {
                    int cost = (minHeight - curHeight) * (minHeight - curHeight);

                    totalCost += cost;
                } else if (curHeight > minHeight + 17) {
                    int cost = (curHeight - (minHeight + 17)) * (curHeight - (minHeight + 17));

                    totalCost += cost;
                }
            }

            ans = Math.min(ans, totalCost);
        }

        System.out.print(ans);
    }
}