import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int max = 0;
        for (int i = X; i <= Y; i++) {

            int temp = i;

            int sum = 0;
            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }

            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}