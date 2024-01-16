import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] negative = new int[101];
        int[] positive = new int[101];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int k = x1; k < x2; k++) {
                if (k < 0) negative[k * -1]++;
                else positive[k]++;
            }
        }

        int max = 0;

        for (int i = 0; i <= 100; i++) {
            if (max < positive[i]) max = positive[i];
            if (max < negative[i]) max = negative[i];
        }

        System.out.print(max);
    }
}