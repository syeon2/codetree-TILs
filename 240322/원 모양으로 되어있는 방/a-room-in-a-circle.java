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
        for (int i = 0; i < N; i++) {
            int temp = 0;

            for (int k = 0; k < N; k++) {
                int room = (k + i) % N;

                temp += k * list[room];
            }

            ans = Math.min(ans, temp);
        }

        System.out.print(ans);
    }
}