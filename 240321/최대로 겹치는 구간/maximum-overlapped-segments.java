import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int OFFSET = 100;

        int[] arr = new int[101 + OFFSET];

        for (int n = 0; n < N; n++) {
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            for (int i = x1; i < x2; i++) {
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