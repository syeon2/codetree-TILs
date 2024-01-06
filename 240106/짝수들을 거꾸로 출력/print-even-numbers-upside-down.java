import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            list[i] = num;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (list[i] % 2 == 0) System.out.printf("%d ", list[i]);
        }
    }
}