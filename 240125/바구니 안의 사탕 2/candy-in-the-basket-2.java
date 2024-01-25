import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[101];

        for (int i = 0; i < N; i++) {

            int candy = sc.nextInt();
            int idx = sc.nextInt();

            list[idx] += candy;
        }

        int max = 0;

        for (int i = K; i <= 100 - K; i++) {

            int temp = 0;
            for (int k = i - K; k <= i + K; k++) {
                temp += list[k];
            }

            if (max < temp) max = temp;
        }

        System.out.print(max);
    }
}