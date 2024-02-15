import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] binary = sc.next().toCharArray();

        int convertedBinary = convertToInt(binary);

        convertedBinary *= 17;

        System.out.print(convertToBinary(convertedBinary));
    }

    public static String convertToBinary(int num) {
        if (num == 0) return "0";

        String str = "";

        while (num >= 2) {
            if (num % 2 == 0) str = "0" + str;
            else str = "1" + str;

            num /= 2;
        }

        if (num == 1) str = "1" + str;

        return str;
    }

    public static int convertToInt(char[] list) {
        int total = 0;

        for (int i = 0; i < list.length; i++) {
            total = total * 2 + (list[i] - '0');
        }

        return total;
    }
}