import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String N = sc.next();

        int integer = changeNotationToInt(N, a);

        System.out.print(changeToNotation(integer, b));
    }

    public static String changeToNotation(int num, int b) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0, num % b);

            num /= b;
        }

        return sb.toString();
    }

    public static int changeNotationToInt(String notation, int b) {
        int sum = 0;

        for (int i = 0; i < notation.length(); i++) {
            sum = (sum * b) + (notation.charAt(i) - '0');
        }

        return sum;
    }
}