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

        int max = 0;
        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N; k++) {
                if (Math.abs(i - k) <= 1) continue;

                int sum = list[i] + list[k];

                if (max < sum) max = sum;
            }
        }

        System.out.print(max);
    }
}