import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(convertNo(N, B));
    }

    public static String convertNo(int n, int b) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.insert(0, n % b);

            n /= b;
        }

        return sb.toString();
    }
}