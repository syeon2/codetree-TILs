import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = (num * a) + (arr[i] - '0');
        }

        System.out.print(convertB(num, b));
    }

    public static String convertB(int n, int b) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.insert(0, n % b);

            n /= b;
        }

        return sb.toString();
    }
}