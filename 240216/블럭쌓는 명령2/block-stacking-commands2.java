import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N + 1];

        int max = 0;

        for (int n = 0; n < K; n++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = a; i <= b; i++) {
                list[i]++;

                if (max < list[i]) max = list[i];
            }
        }

        System.out.print(max);
    }
}