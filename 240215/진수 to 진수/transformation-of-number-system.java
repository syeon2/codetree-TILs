import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] list = sc.next().toCharArray();

        int convertedInt = convertToInt(list, a);

        System.out.print(convertToB(convertedInt, b));
    }

    public static String convertToB(int n, int b) {
        if (n == 0) return "0";

        String str = "";

        while (n >= b) {
            if (n % b == 0) str = "0" + str;
            else str = String.valueOf(n % b) + str;

            n /= b;
        }

        if (n != 0) str = String.valueOf(n) + str;

        return str;
    }

    public static int convertToInt(char[] list, int a) {
        int total = 0;

        for (int i = 0; i < list.length; i++) {
            total = total * a + (list[i] - '0');
        }

        return total;
    }
}