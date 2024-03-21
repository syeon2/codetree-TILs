import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int k = 0; k < K; k++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int i = A; i <= B; i++) {
                arr[i]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }

        System.out.print(ans);
    }
}