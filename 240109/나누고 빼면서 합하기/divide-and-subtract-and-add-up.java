import java.util.Scanner;

public class Main {
    public static int num = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        operate(list, m);

        System.out.print(num);
    }

    public static void operate(int[] list, int m) {
        while (m >= 1) {
            if (m % 2 == 0) {
                num += list[m - 1];
                m /= 2;
            } else {
                num += list[m - 1];
                m -= 1;
            }
        }
    }
}