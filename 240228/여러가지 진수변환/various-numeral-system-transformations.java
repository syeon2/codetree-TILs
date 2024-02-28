import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(change(N, B));
    }

    public static String change(int num, int b) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0, num % b);

            num /= b;
        }

        return sb.toString();
    }
}