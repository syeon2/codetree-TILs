import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = X; i <= Y; i++) {

            int temp = 0;

            int num = i;

            while (num != 0) {
                temp += num % 10;
                num /= 10;
            }

            max = Math.max(max, temp);
        }

        System.out.print(max);
    }
}