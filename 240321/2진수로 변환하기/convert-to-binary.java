import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(convertBinary(N));
    }

    public static String convertBinary(int n) {
        if (n == 0) return "0";
        
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }

        return sb.toString();
    }
}