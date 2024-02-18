import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        for (int n = 0; n < N; n++) {
            list[n] = sc.nextInt();
        }

        int ans = -1;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    if (check(list[i], list[k], list[j])) ans = Math.max(ans, list[i] + list[k] + list[j]);
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean check(int a, int b, int c) {
        int tempA = a;
        int tempB = b;
        int tempC = c;
        int AandB = tempA + tempB;

        while (tempA > 0 && tempB > 0) {
            if ((tempA % 10) + (tempB % 10) >= 10) return false;

            tempA /= 10;
            tempB /= 10;
        }

        while (AandB > 0 && tempC > 0) {
            if ((AandB % 10) + (tempC % 10) >= 10) return false;

            AandB /= 10;
            tempC /= 10;
        }

        return true;
    }
}