import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            list[i] = n;
        }

        while (N > 1) {

            int max = 0;
            int idx = 0;

            for (int i = 0; i < N; i++) {
                if (list[i] > max) {
                    max = list[i];
                    idx = i;
                }
            }

            System.out.printf("%d ", idx + 1);

            N = idx;
        }
    }
}