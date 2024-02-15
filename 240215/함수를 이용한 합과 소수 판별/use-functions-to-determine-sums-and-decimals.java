import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(cntNum(a, b));
    }

    public static int cntNum(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEven(i)) cnt++;
        }

        return cnt;
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static boolean isEven(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;

            num /= 10;
        }

        if (sum % 2 == 0) return true;
        else return false;
    }
}