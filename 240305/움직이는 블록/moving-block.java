import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        int max = 0;
        int min = 10001;
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            max = Math.max(max, list[i]);
            min = Math.min(min, list[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = min; i <= max; i++) {

            int temp = 0;
            for (int k = 0; k < N; k++) {
                temp += Math.abs(list[k] - i);
            }

            ans = Math.min(ans, temp);
        }

        System.out.print(ans / 2);
    }
}