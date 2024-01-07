import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int idx = 0;

        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (n > max) {
                max = n;
                idx = i;
            }

            list[i] = n;
        }

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (i == idx) continue;

            if (max2 < list[i]) max2 = list[i];
        }

        System.out.printf("%d %d", max, max2);
    }
}