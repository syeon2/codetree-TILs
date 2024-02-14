import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (isMagicNum(N)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isMagicNum(int n) {
        if (n % 2 == 0) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;

                n /= 10;
            }

            if (sum % 5 == 0) return true;
        }

        return false;
    }
}