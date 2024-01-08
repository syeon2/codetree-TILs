import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (isStatified(N)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isStatified(int num) {
        if (num % 2 == 0 && sumPos(num) % 5 == 0) return true;
        else return false;
    }

    public static int sumPos(int num) {
        int sum = 0;

        while (num != 0) {
            int temp = num % 10;

            sum += temp;
            num /= 10;
        }

        return sum;
    }
}