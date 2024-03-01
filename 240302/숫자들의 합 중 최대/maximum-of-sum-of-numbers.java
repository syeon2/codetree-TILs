import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;
        for (int i = X; i <= Y; i++) {
            ans = Math.max(ans, func(i));
        }

        System.out.print(ans);
    }

    public static int func(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}