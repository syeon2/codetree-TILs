import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int total = 0;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            total += list[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int tempTotal = total;
            int tempMove = 0;

            for (int k = i; k < N + i; k++) {
                int idx = k % N;

                tempTotal -= list[idx];
                tempMove += tempTotal;
            }

            ans = Math.min(ans, tempMove);
        }

        System.out.print(ans);
    }
}