import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] position = new int[101];
        for (int i = 0; i < N; i++) {
            int candy = sc.nextInt();
            int pos = sc.nextInt();

            position[pos] += candy;
        }

        int max = 0;
        for (int i = 0; i <= 100; i++) {

            int start = i - K;
            int end = i + K;

            start = Math.max(0, start);
            end = Math.min(100, end);

            int temp = 0;
            for (int k = start; k <= end; k++) {
                temp += position[k];
            }

            if (max < temp) max = temp;
        }

        System.out.print(max);
    }
}