import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] == 1) {
                ans++;
                i += 2 * M;
            }
        }

        System.out.print(ans);
    }
}