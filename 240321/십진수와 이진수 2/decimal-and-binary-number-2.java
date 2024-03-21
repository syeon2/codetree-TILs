import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = (num * 2) + (arr[i] - '0');
        }

        num *= 17;

        System.out.print(convertBinary(num));
    }

    public static String convertBinary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.insert(0, n % 2);

            n /= 2;
        }

        return sb.toString();
    }
}