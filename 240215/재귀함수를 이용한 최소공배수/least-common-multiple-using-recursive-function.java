import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print(recur(list, n - 1));
    }

    public static int recur(int[] list, int n) {
        if (n == 0) return list[n];

        int compared = recur(list, n - 1);

        return lcm(list[n], compared);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}