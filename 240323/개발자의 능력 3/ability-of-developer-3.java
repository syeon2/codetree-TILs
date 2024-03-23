import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int[] list = new int[6];
        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextInt();
            total += list[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6; k++) {
                for (int l = 0; l < 6; l++) {
                    if (i == k || i == l || k == l) continue;

                    int sum = list[i] + list[k] + list[l];

                    int other = total - sum;

                    ans = Math.min(ans, Math.abs(sum - other));
                }
            }
        }

        System.out.print(ans);
    }
}