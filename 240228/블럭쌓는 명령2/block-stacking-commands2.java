import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N + 1];

        for (int t = 0; t < K; t++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int i = start; i <= end; i++) {
                list[i]++;
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, list[i]);
        }

        System.out.print(max);
    }
}