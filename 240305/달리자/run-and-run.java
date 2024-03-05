import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] > b[i]) {
                int sub = a[i] - b[i];

                ans += sub;
                a[i + 1] += sub;
            }
        }

        System.out.print(ans);
    }
}