import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(convert(n, b));
    }

    public static String convert(int n, int b) {
        if (n == 0) return "0";

        String str = "";

        while (n > b) {
            if (n % b == 0) str = "0" + str;
            else str = String.valueOf(n % b) + str;

            n /= b;
        }

        if (n != 0) str = String.valueOf(n) + str;

        return str;
    }
}