import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int underMax = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num >= max) {
                underMax = max;
                max = num;
            } else if (num >= underMax) {
                underMax = num;
            }
        }

        System.out.printf("%d %d", max, underMax);
    }
}