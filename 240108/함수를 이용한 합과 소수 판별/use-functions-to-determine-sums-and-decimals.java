import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isAllEven(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean isPrime(int num) {
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static boolean isAllEven(int num) {
        int sum = 0;

        while (num != 0) {
            int temp = num % 10;

            sum += temp;

            num /= 10;
        }

        if (sum % 2 == 0) return true;
        else return false;
    }
}