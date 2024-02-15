import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(convert(n));
    }

    public static String convert(int n) {
        String binary = "";

        while (!(n == 1 || n == 0)) {
            if (n % 2 == 0) binary = "0" + binary;
            else binary = "1" + binary;

            n /= 2;
        }

        if (n == 1) binary = "1" + binary;

        return binary;
    }
}