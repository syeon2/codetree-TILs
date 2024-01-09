import java.util.Scanner;

public class Main {
    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(sum(a, b));
        }
    }

    public static int sum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += list[i - 1];
        }

        return sum;
    }
}