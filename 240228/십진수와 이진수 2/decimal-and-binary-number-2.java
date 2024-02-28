import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String bi = sc.next();

        int integer = changeInt(bi);

        integer *= 17;

        System.out.print(changeBi(integer));
    }

    public static String changeBi(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0, num % 2);

            num /= 2;
        }

        return sb.toString();
    }

    public static int changeInt(String binary) {
        int sum = 0;

        for (int i = 0; i < binary.length(); i++) {
            sum = (sum * 2) + (binary.charAt(i) - '0');
        }

        return sum;
    }
}