import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) sum += i;
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}