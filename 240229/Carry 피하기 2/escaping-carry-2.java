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

        int max = -1;

        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    if (canCarry(list[i], list[k]) && canCarry(list[i] + list[k], list[j])) {
                        int sum = list[i] + list[k] + list[j];

                        if (sum > max) max = sum;
                    }
                }
            }
        }

        System.out.print(max);
    }

    public static boolean canCarry(int a, int b) {
        while (a > 0 && b > 0) {
            int tempA = a % 10;
            int tempB = b % 10;

            if (tempA + tempB >= 10) return false;

            a /= 10;
            b /= 10;
        }

        return true;
    }
}